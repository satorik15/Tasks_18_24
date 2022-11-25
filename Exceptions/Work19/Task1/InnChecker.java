package Exceptions.Work19.Task1;
import java.util.Scanner;
public class InnChecker
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Введите номер ИНН");
            try{
                long inn = Long.parseLong(sc.nextLine());
                checkInn(inn);
                break;
            }catch (InnNotValidException e){
                System.out.println(e.getLocalizedMessage());
            }
        }
        System.out.println("ИНН действителен!");
    }

    public static boolean checkInn(long inn) throws InnNotValidException{
        int i=0;
        long innNum=inn;
        while(innNum>0)
        {
            i++;
            innNum=innNum/10;
        }
        if(i != 10 && i != 12) throw new InnNotValidException(inn);
        return true;
    }
}

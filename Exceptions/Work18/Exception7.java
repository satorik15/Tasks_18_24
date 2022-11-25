package Exceptions.Work18;
import java.util.Scanner;
public class Exception7
{
    public void getKey()
    {
        try {
            Scanner myScanner = new Scanner(System.in);
            String key = myScanner.next();
            printDetails(key);
        }catch (Exception e)
        {
            throw e;
        }
    }

    public void printDetails(String key){
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    private String getDetails(String key)
    {
        if(key == "") {
            try {
                throw new Exception( "Key set to empty string" );
            } catch (Exception e) {
                System.out.println(e);;
            }
        }
        return "data for " + key;
    }

    public static void main(String[] args)
    {
        Exception7 x = new Exception7();
        x.getKey();
        System.out.println(x.getDetails(""));
    }
}

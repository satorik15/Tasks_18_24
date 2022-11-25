package Exceptions.Work18;
import java.util.Scanner;
public class Exception2 {
    public  void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }catch(NumberFormatException e) {
            System.out.println("Attempted to enter not int");
        }

    }
    public static void main(String[] args) {
        Exception2 x= new Exception2();
        x.exceptionDemo();
    }
}

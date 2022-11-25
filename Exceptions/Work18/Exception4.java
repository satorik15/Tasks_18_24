package Exceptions.Work18;

import java.util.Scanner;

public class Exception4
{
    public void exceptionDemo() {
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
        }finally {
            System.out.println("Finish");
        }

    }
    public static void main(String[] args) {
        Exception4 x = new Exception4();
        x.exceptionDemo();
    }

}

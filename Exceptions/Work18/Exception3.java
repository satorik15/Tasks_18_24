package Exceptions.Work18;

import java.util.Scanner;

public class Exception3
{
    public  void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }catch (Exception e)
        {
            System.out.println("Error");
        }

    }
    public static void main(String[] args) {
        Exception3 x = new Exception3();
        x.exceptionDemo();
    }
}

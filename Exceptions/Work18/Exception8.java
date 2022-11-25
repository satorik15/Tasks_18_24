package Exceptions.Work18;

import java.util.Scanner;
public class Exception8
{
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);

        boolean marker = false;
        do {
            marker = false;
            System.out.print("Enter a Key ");
            String key = myScanner.nextLine();
            try{
                printDetails(key);
            }catch (Exception e){
                marker = true;
            }
        }while (marker);
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message ); }
    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        Exception8 x = new Exception8();
        try {
            x.getKey();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}



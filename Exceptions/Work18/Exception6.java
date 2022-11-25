package Exceptions.Work18;

public class Exception6 {
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }
    public String getDetails(String key) {
        if(key == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                System.out.println(e);
            }
        }

        return  key;
    }
    public static void main(String[] args) {
        Exception6 x = new Exception6();
        x.printMessage(x.getDetails(null));
    }
}

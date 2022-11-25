package Exceptions.Work18;

public class ThrowsDemo
{
    public void getDetails(String key) {
        if(key == null) {
            try {

                throw new NullPointerException("null key in getDetails");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        // do something with the key
    }


    public static void main(String[] args)
    {
        ThrowsDemo x = new ThrowsDemo();
        x.getDetails(null);
    }
}


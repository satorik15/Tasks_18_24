package Exceptions.Work19.Task1;

public class InnNotValidException extends Exception
{
    private long innNum;
    public InnNotValidException(long inn){
        super("ИНН с номером "+ inn + " не действителен!");
        innNum = inn;
    }

    public long getInnNum() {
        return innNum;
    }
}

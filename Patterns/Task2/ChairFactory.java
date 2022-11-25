package Patterns.Task2;

public class ChairFactory implements AbstractChairFactory
{
    public VictorianChair createVictorianChair()
    {
        VictorianChair victorianChair= new VictorianChair();
        return victorianChair;
    }
    public MagicChair createMagicChair()
    {
        MagicChair magicChair = new MagicChair();
        return magicChair;
    }
    public FunctionalChair createFuctionalChair()
    {
        FunctionalChair functionalChair = new FunctionalChair();
        return functionalChair;
    }
}

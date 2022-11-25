package Patterns.Task1;

public class Tester
{
    public static void main(String[] args) {
        ConcreteFactory factory = new ConcreteFactory();
        factory.CreateComplex(1,4);
        factory.createComplex();

    }
}

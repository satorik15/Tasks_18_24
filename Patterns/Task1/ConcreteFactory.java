package Patterns.Task1;

public class ConcreteFactory implements ComplexAbstractFactory
{

    public Complex createComplex() {
        Complex complex= new Complex();
        return complex;
    }

    public Complex CreateComplex(int re, int im) {
        Complex complex= new Complex(re,im);
        return complex;
    }
}

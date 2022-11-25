package Patterns.Task1;

public class Complex
{
    private int re;
    private int im;

    public Complex(int re, int im) {
        this.re = re;
        this.im = im;
    }

    public Complex() {

    }

    public int getRe() {
        return re;
    }

    public void setRe(int re) {
        this.re = re;
    }

    public int getIm() {
        return im;
    }

    public void setIm(int im) {
        this.im = im;
    }

    @Override
    public String toString() {
        return "ConcreteFactory{" +
                "re=" + re +
                ", im=" + im +
                '}';
    }
}

package Work20.Task1_3;

public class Generic<T extends String, V extends Animal, K extends Number>{
    private T obT;
    private V obV;
    private K obK;

    public Generic(T obT, V obV, K obK) {
        this.obT = obT;
        this.obV = obV;
        this.obK = obK;
    }

    public T getObT() {
        return obT;
    }

    public V getObV() {
        return obV;
    }

    public K getObK() {
        return obK;
    }
    public void showTypes()
    {
        System.out.println("Type T: "+obT.getClass().getName());
        System.out.println("Type V: "+obV.getClass().getName());
        System.out.println("Type K: "+obK.getClass().getName());
    }

    public static void main(String[] args) {
        Generic<String, Dog,Integer> generic = new Generic<>("str",new Dog(),5);
        generic.showTypes();
    }
}

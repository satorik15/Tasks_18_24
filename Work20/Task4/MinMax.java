package Work20.Task4;
public class MinMax<T extends Comparable<T>>
{
    private T[] massive;

    public MinMax(T[] massive) {
        this.massive = massive;
    }

    public void MinMax(T[] massive)
    {
        T max = massive[0];
        T min = massive[0];
        for(int i=0;i<massive.length;i++)
        {
            if(max.compareTo(massive[i])<0)
            {
                max=massive[i];
            }
            if(min.compareTo(massive[i])>0)
            {
                min=massive[i];
            }
        }
        System.out.println("max:"+max);
        System.out.println("min"+min);
    }

    public static void main(String[] args) {
        MinMax<Integer> minmax;
    }
}

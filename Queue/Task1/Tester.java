package Queue.Task1;

import Queue.Task1.ArrayQueueModule;

public class Tester
{
    public static void main(String[] args)
    {
        ArrayQueueModule module = new ArrayQueueModule();
        module.enqueue(2);
        System.out.println(module.size());
    }
}

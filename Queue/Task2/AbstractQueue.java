package Queue.Task2;

public abstract class AbstractQueue implements Queue {

    abstract public void enqueue(Object element);

    abstract public Object element();

    abstract public Object dequeue();

    abstract public int size();

    abstract public boolean isEmpty();

    abstract public void clear();

    abstract public Object[] toArray();
}

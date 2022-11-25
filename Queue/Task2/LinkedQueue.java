package Queue.Task2;

public class LinkedQueue extends AbstractQueue {
    private int size = 0;
    private Node start, end;

    @Override
    public void enqueue(Object element) {
        Node tmp = new Node(element);
        if (size == 0) {
            end = tmp;
            start = tmp;
        } else {
            end.next = tmp;
            end = tmp;
        }
        size++;
    }

    @Override
    public Object element() {
        return start.value;
    }

    @Override
    public Object dequeue() {
        Object tmp = start.value;
        start = start.next;
        size--;
        return tmp;
    }

    @Override
    public Object remove() {
        return null;
    }

    public Object peek() {
        return null;
    }


    public void push(Object element) {

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public Object[] toArray() {
        Object[] elements = new Object[size];
        Node head = start;
        int i = 0;

        while (head.next != null) {
            elements[i] = head.value;
            i++;
        }

        return elements;
    }

    private static class Node {
        Object value;
        Node next;

        Node(Object element){
            this.value = element;
            this.next = this;
        }
    }
}

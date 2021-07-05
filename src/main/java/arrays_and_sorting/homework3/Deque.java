package arrays_and_sorting.homework3;

import java.util.Arrays;

public class Deque <T> {
    private final int DEFAULT_CAPACITY = 10;
    private T[] list;
    private int size;
    private int begin;
    private int end;

    public Deque() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public static void main(String[] args) {
        Deque <Integer> deque = new Deque <>();
        deque.insertLeft(1);
        deque.insertLeft(2);
        deque.insertLeft(3);
        deque.insertRight(9);
        deque.insertRight(8);
        deque.insertRight(7);
        System.out.println(deque);
        deque.removeLeft();
        deque.removeRight();
        System.out.println(deque.removeLeft());
        System.out.println(deque.removeRight());
        System.out.println(deque);
        deque.insertLeft(1);
        deque.insertLeft(2);
        deque.insertLeft(3);
        deque.insertRight(9);
        deque.insertRight(8);
        deque.insertRight(7);
        deque.insertLeft(1);
        deque.insertLeft(2);
        System.out.println(deque.removeLeft());
        System.out.println(deque.removeRight());
        System.out.println(deque);

    }

    public void insertLeft(T item) {
        if(isFull()) {
            throw new RuntimeException("Deque is full");
        } else if(size == 0) {
            begin = end;
            list[begin] = item;
            size++;
        } else {
            if(++ begin >= list.length) begin = 0;
            list[begin] = item;
            size++;
        }
    }

    public void insertRight(T item) {
        if(isFull()) {
            throw new RuntimeException("Deque is full");
        } else if(size == 0) {
            end = begin;
            list[end] = item;
            size++;
        } else {
            if(-- end < 0) end = list.length - 1;
            list[end] = item;
            size++;
        }
    }

    public T removeLeft() {
        T temp = peek(begin);
        list[begin] = null;
        begin--;
        if(begin < 0) begin = list.length - 1;
        size--;
        return temp;
    }

    public T removeRight() {
        T temp = peek(end);
        list[end] = null;
        end++;
        if(end >= list.length) end = 0;
        size--;
        return temp;
    }

    public T peek(int index) {
        if(isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        return list[index];
    }

    public boolean isFull() {
        return size == list.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(list) + " b = " + begin + " e = " + end;
    }
}

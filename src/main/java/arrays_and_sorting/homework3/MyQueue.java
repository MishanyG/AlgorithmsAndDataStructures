package arrays_and_sorting.homework3;

import java.util.Arrays;

public class MyQueue<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;

    //0 1 2 3 4
    //  b
    //    e
    //  7

    public MyQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyQueue() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void insert(T item) {
        if (isFull()) {
            reCapacity(size + (size/2 + 1));
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }

    public T remove() {
        T temp = peek();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return temp;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        return list[begin];
    }

    private int nextIndex(int index) {
        if(!isFull())
            return (index + 1) % list.length;
        else
            return ++index;
    }

    public boolean isFull() {
        return size == list.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void reCapacity(int newCapacity) {
        T[] tempArr = (T[]) new Object[newCapacity];
        if (size > 0)
            if (begin < end)
                System.arraycopy(list, begin, tempArr, 0, size);
            else {
                System.arraycopy(list, begin, tempArr, 0, list.length - begin);
                System.arraycopy(list, 0, tempArr, list.length - begin, end);
            }
        list = tempArr;
        begin = 0;
        if (size == newCapacity)
            end = 0;
        else
            end = size;
    }

    @Override
    public String toString() {
        return Arrays.toString(list) + " b = " + begin + " e = " + end;
    }
}


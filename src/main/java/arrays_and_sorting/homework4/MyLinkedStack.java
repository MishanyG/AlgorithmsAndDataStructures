package arrays_and_sorting.homework4;

public class MyLinkedStack<E> {
    private MyLinkedList<E> list = new MyLinkedList<>();

    public void push (E j) {
        list.insertFirst(j);
    }

    public E pop () {
        return list.removeFirst();
    }

    public boolean isEmpty () {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return list.toString();
    }

    public static void main(String[] args) {
        MyLinkedStack<Integer> stackList = new MyLinkedStack <>();

        stackList.push(1);
        stackList.push(2);
        stackList.push(3);
        stackList.push(4);
        System.out.println(stackList);

        stackList.push(5);
        stackList.push(6);
        stackList.push(7);
        stackList.push(8);
        System.out.println(stackList);

        stackList.pop();
        stackList.pop();
        stackList.pop();
        System.out.println(stackList);
    }
}

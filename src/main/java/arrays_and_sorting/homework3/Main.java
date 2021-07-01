package arrays_and_sorting.homework3;

public class Main {
    public static void main(String[] args) {
//        MyStack<Integer> stack = new MyStack<>();
//
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//
//        System.out.println(stack.peek());
//
////        for (int i = 0; i < 4; i++) {
////            System.out.println(stack.pop());
////        }

//        Expression e = new Expression("(a+4)+(-5-t)+{q}+[+y^3]+[{w+r}]");
//        Expression e = new Expression("(a+4)+(-5-t)+{q}+[+y^3]+[{w+r}]");
//        System.out.println(e.checkBracket());


//        MyQueue<Integer> queue = new MyQueue<>();
//        queue.insert(1);
//        queue.insert(2);
//        queue.insert(3);
//        queue.insert(4);
//
//        System.out.println(queue);
//
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue);
//
//        queue.insert(11);
//        queue.insert(12);
//        queue.insert(13);
//        queue.insert(14);
//        queue.insert(15);
//        queue.insert(16);
//        System.out.println(queue);
//        queue.insert(17);
//        queue.insert(18);
//        System.out.println(queue);
//        queue.remove();
//        queue.insert(19);
//        System.out.println(queue);


        MyPriorityQueue<Integer> mpq = new MyPriorityQueue<>();

        mpq.insert(6);
        mpq.insert(2);
        mpq.insert(8);
        mpq.insert(7);
        mpq.insert(3);
        System.out.println(mpq);
        mpq.insert(5);
        System.out.println(mpq);

        System.out.println(mpq.remove());
        System.out.println(mpq);


    }
}


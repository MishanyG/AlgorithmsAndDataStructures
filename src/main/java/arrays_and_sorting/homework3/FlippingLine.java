package arrays_and_sorting.homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlippingLine {
    private char[] line;
    private int top;
    private int size;

    public FlippingLine(int count) {
        line = new char[count];
        top = - 1;
        size = count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FlippingLine flippingLine;
        String input;
        while(true) {
            System.out.println("Введите строки: ");
            input = reader.readLine();
            if(input.equals("")) return;
            flippingLine = new FlippingLine(input.length());
            System.out.println("Строка наоборот: " + flippingLine.flipOver(input));
        }
    }

    public void push(char x) {
        line[++ top] = x;
    }

    public char pop() {
        return line[top--];
    }

    public char peek() {
        return line[top];
    }

    public boolean isEmpty() {
        return top == - 1;
    }

    public String flipOver(String in) {
        char x;
        for(int i = 0; i < size; i++) {
            x = in.charAt(i);
            push(x);
        }
        String out = "";
        while(! isEmpty()) {
            x = pop();
            out += x;
        }
        return out;
    }
}

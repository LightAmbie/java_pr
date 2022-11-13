package mirea.ru.lazarev_pavel.kvbo0121.pr22.test;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(3);
        stack.push(6);

        stack.printStack();

        stack.pop();

        stack.printStack();
    }
}

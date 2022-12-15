package lab1.task1Stack;

public class Main {
    public static void main(String[] args) {
        SimpleStack<Integer> stack = new SimpleStack<>();
        stack.push(8);
        stack.push(8);
        stack.push(7);
        stack.push(4);
        stack.showContains();
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println();
        stack.showContains();
    }
}

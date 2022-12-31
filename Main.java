import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        stack.push('a');
        stack.push('c');
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}

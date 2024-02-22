import java.util.Stack;

class CustomStack {
    private Stack<Integer> stack;

    public CustomStack() {
        stack = new Stack<>();
    }

    public void push(int element) {
        stack.push(element);
        System.out.println("Pushed element: " + element);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1; // Or throw an exception
        }
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        return poppedElement;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {
        CustomStack customStack = new CustomStack();

        customStack.push(10);
        customStack.push(20);
        customStack.push(30);

        customStack.pop();
        customStack.pop();
        customStack.pop();
        customStack.pop(); // Trying to pop from an empty stack
    }
}

import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        int x = stack.pop();
        if (x == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(3);
        minStack.push(5);
        System.out.println("Current min: " + minStack.getMin()); // Output: 3

        minStack.push(2);
        minStack.push(1);
        System.out.println("Current min: " + minStack.getMin()); // Output: 1

        minStack.pop();
        System.out.println("Current top: " + minStack.top());     // Output: 2
        System.out.println("Current min: " + minStack.getMin());  // Output: 2

        minStack.pop();
        System.out.println("Current min: " + minStack.getMin());  // Output: 3
    }
}

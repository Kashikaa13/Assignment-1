import java.util.ArrayList;

public class Growable_stk implements Interface_STK {
    private ArrayList<Integer> stack;
    private int top;

    public Growable_stk() {
        this.stack = new ArrayList<>(5); // Initial capacity of 5
        this.top = -1; // Initialize top as -1 to indicate the stack is empty
    }

    @Override
    public void push(int element) {
        if (isOverflow()) {
            // Automatically resize the stack, no need to check for overflow in an ArrayList
            System.out.println("Increasing stack capacity.");
            // No explicit action required to increase capacity, ArrayList handles it
        }

        top++;
        if (top < stack.size()) {
            stack.set(top, element);
        } else {
            stack.add(element);
        }
        System.out.println("Pushed element: " + element + ". Size: " + size() + ", Capacity: " + capacity());
    }

    @Override
    public int pop() {
        if (isUnderflow()) { 
            System.out.println("Stack is Empty");
            return -1;
        }
        int element = stack.get(top);
        stack.remove(top); // This line actually shrinks the ArrayList, removing the last element
        top--;
        System.out.println("Popped element: " + element + ". Size: " + size() + ", Capacity: " + capacity());
        return element;
    }

    @Override
    public void displayStack() {
        if (isUnderflow()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.println(stack.get(i));
        }
    }

    @Override
    public boolean isOverflow() {
        // In case of ArrayList, overflow does not happen as it grows dynamically.
        // This method might not be needed but kept for interface compliance.
        return false;
    }

    @Override
    public boolean isUnderflow() {
        return top == -1;
    }

    public int size() {
        return top + 1; // Size is always top + 1 because top starts from -1
    }

    public int capacity() {
        return stack.size(); // In ArrayList, size() gives the current number of elements
    }

    // Additional methods for interface compliance, if any, go here.
}

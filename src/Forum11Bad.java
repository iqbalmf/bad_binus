import java.util.LinkedList;

public class Forum11Bad {
    private final int maxSize;
    private final long[] stackArray;
    private int top;

    public Forum11Bad(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }

    public static void main(String[] args) {
        stack();


        LinkedList<String> lList = new LinkedList<String>();
        lList.add("1");
        lList.add("8");
        lList.add("6");
        lList.add("4");
        lList.add("5");
        System.out.println(lList);
        lList.subList(1, 3).clear();
        System.out.println(lList);
    }

    private static void stack() {
        //stack push - pop
        TP2 theStack = new TP2(5);

        theStack.push(10);
        theStack.push(20);
        theStack.push(30);
        theStack.push(40);
        theStack.push(50);
        System.out.println("===PUSH===");
        while (!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.println(value);
        }
        System.out.println("===POP===");
        theStack.reset();
        theStack.pop();
        theStack.pop();
        while (!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.println(value);
        }

    }

    public void push(long j) {
        stackArray[++top] = j;
    }

    public long pop() {
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public void reset() {
        top = maxSize - 1;
    }
}

public class Stack {


    // the index of the most recent insertion
    private int top = 0;

    private int[] content = new int[5];         // sa facem INTEGER

    //boolean isEmpty;System.out.println(myStack.isEmpty());

    public boolean isEmpty() {
        if (top == 0) {
            return true;
        }
        return false;

    }

    public void push(int element) {
        if (content.length < top + 2) {
            increaseStack();
        }
        content[top + 1] = element;
        top++;
    }

    public int pop() {
        int element = content[top];
        top--;
        return element;
    }

    private void increaseStack() {
        int[] newArray = new int[content.length + content.length / 2];             //memory
        System.arraycopy(content, 0, newArray, 0, content.length);
        content = newArray;

    }

}

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        System.out.println(myStack.isEmpty());
        myStack.push(4);
        //myStack.pop();
        System.out.println(myStack.pop());
        myStack.push(3);
        myStack.push(2);
        myStack.push(6);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        myStack.push(8);
        myStack.push(9);
        System.out.println(myStack.pop());

        System.out.println(myStack.isEmpty());
        myStack.push(2);
        myStack.push(6);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(22);
        myStack.push(6);
        myStack.push(77);
        myStack.push(8);
        myStack.push(99);
        System.out.println(myStack.isEmpty());


    }
}

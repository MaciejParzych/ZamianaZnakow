package ProjektZamianaBajtow;

// using Arrays
public class Stack {
    int capacity = 1_000;
    int[] arr;
    int top;
    int min = 0;
    int max = 0;

    Stack() {
        arr = new int[capacity];
        top = -1;
    }

    void push(int x) {
        if (top == -1) {
            min = Integer.MAX_VALUE;
            max = Integer.MIN_VALUE;
        }
        if (x < min) {
            min = x;
        }
        if (x>max){
            max=x;
        }

        top++;
        arr[top] = x;


        if (top>4){
            Stack stack2 = new Stack();
        }

    }


    int peek() {
        return arr[top];
    }

    int pop() {
        int x = arr[top--];

        return x;
    }

    boolean isEmpty() {
        return top < 0;
    }

    int actualSize() {
        return top + 1;
    }

    int maxSize() {
        return capacity;
    }

    int minimumElement() {
        return min;
    }

    void show(){
        for (int i = top+1; i>-1;i--){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(122);
        stack.push(42);
        stack.push(56);
        stack.push(78);
        stack.pop();
//        System.out.println(stack.peek());
        System.out.println();
        System.out.println();
        stack.show();
//        System.out.println(stack.isEmpty());
//        System.out.println(stack.peek());
//
//        System.out.println(stack.actualSize());
//        System.out.println(stack.maxSize());
//
//        System.out.println(stack.min);
//        System.out.println(stack.max);

    }
}

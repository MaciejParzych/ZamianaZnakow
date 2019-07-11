package ProjektZamianaBajtow;

public class BalancedParenheses {
    static class Stack {
//        int top = -1;
//        char[] arr = new char[100];
//
//        void push(char x){
//            top++;
//            arr[top] = x;
//        }
//
//        char pop(){
//            return arr[--top];
//        }
//
////        char peek(){
////            return arr[top];
////        }
//
//        boolean isEmpty(){
//            return top<0;
//        }



        int top = -1;
        char items[] = new char[100];

        void push(char x) {
            if (top == 99) {
                System.out.println("Stack full");
            } else {
                items[++top] = x;
            }
        }

        char pop() {
            if (top == -1) {
                System.out.println("Underflow error");
                return '\0';
            } else {
                char element = items[top];
                top--;
                return element;
            }
        }

        boolean isEmpty() {
            return top==-1;
        }


//        static boolean isMathcingPair(char char1, char char2){
//            if (char1=='{' && char2=='}'){
//                return true;
//            }
//            else if (char1=='[' && char2==']'){
//                return true;
//            }
//            else if (char1=='(' && char2==')'){
//                return true;
//            }
//            else {
//                return false;
//            }
//        }

        static boolean areParethesesBalanced(char[] exp){
            Stack stack = new Stack();
            for (int i = 0; i < exp.length; i++){
                if (exp[i] =='{' || exp[i] =='[' || exp[i]=='('){
                    stack.push(exp[i]);
                }
                if (exp[i] == '}' || exp[i] == ']' || exp[i] ==')'){

                    if (stack.isEmpty()){
                        return false;
                    }
                    else {
                        if (stack.pop() != exp[i]){
                            return false;
                        }
                    }


                }
            }
//
            return true;
        }

        public static void main(String[] args) {
            String s = "()";
            char[] c = s.toCharArray();
            System.out.println(areParethesesBalanced(c));
        }

    }

}

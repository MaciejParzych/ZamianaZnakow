package ProjektZamianaBajtow;



public class BalancedParan {
    static class stack {
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


    }


    static boolean isMatchingPair(char character1, char character2) {
        if (character1 == '(' && character2 == ')')
            return true;
        else if (character1 == '{' && character2 == '}')
            return true;
        else if (character1 == '[' && character2 == ']')
            return true;
        else
            return false; //
    }






    static boolean areParenthesisBalanced(String s) {

        char exp[] = s.toCharArray();
        stack stack = new stack();


        // traversovanie
        for (char c : exp) {

            // jezeli ktorykolwiek znak jest otwierajacym nawiasem to dodaj na stack
            if (c == '{' || c == '(' || c == '[')
                stack.push(c);

            // jezeli jest zamykajacym nawiasem (ending parentheses) to
            if (c == '}' || c == ')' || c == ']') {

                // jezeli jest sam nawias koncowy, a nie ma nic na stacku (czyli nie ma
                // tez nawiasu otwierajacego, to zwroc falsz
                if (stack.isEmpty()) {
                    return false;
                }




             else if (!isMatchingPair(stack.pop(), c)) {
                    return false;
                }


            }


        }




        return stack.isEmpty();

    }

    public static void main(String[] args) {
        char exp[] = {'{', '(', ' ', '}', '[', ']'};

        String s = "(afd{ []   ()] sa})";
        char[] e = s.toCharArray();
        if (areParenthesisBalanced(s))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
        System.out.println("dsds");

    }


}

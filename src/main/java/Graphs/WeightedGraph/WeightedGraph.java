package Graphs.WeightedGraph;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class WeightedGraph {
    static class Edge {

        int source;
        int destination;
        int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }

    }

    static class Graph {
        int V;
        LinkedList<Edge>[] list;

        Graph(int V) {
            this.V = V;
            list = new LinkedList[V];


            for (int i = 0; i < V; i++) {
                list[i] = new LinkedList<>();
            }
        }
//        void addEdge(int v, int w){
//            list[v].add(w);
//        }

        void addEdge(int source, int destination, int weight) {
            Edge edge = new Edge(source, destination, weight);
            list[source].addFirst(edge); // for directed graph
        }

        void printGraph(Graph graph) {
            for (int i = 0; i < graph.V; i++) {
                LinkedList<Edge> l = list[i]; // musi byc <Edge>
                for (int j = 0; j < list.length - 3; j++) {
                    System.out.println("vertex " + i + " is connected to " + l.get(j).destination + " with weight " + l.get(j).weight);
                }
                System.out.println();
            }
        }
    }

    static boolean isNumber(char c) {
        if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9') {
            return true;
        }
        return false;
    }


    static boolean isNumber2(char c) {
        int x = (int) c;
        System.out.println(x);
        for (int i = 48; i < 58; i++) {
            if (x == i) {
                return true;
            }
        }
        return false;
    }

    static String reverseWithStack(String s) {
        Stack stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            stack.push(c);
        }
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            s2 += stack.pop();
        }
        return s2;
    }

    static int reverseInt(int n) {
        Stack<Integer> stack = new Stack();
        while (n > 0) {
            stack.push(n % 10);
            n /= 10;
        }
        int n2 = 0;
        for (int i : stack) {
            n2 = n2 * 10 + i;
        }
        return n2;
    }


    static int countWords(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                count++;
            }
        }
        return ++count; // "ala ma kota" ma tylko 2 spacje, a 3 wyrazy
    }

    static int countWithAtLeastNCharacters(String s, int n) {
        int len = s.length();
        int count = 0, count2 = 0;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                for (int j = i + 1; j < len - 1; j++) {
                    if (s.charAt(j) != ' ') {
                        count++;
                    } else {
                        break;
                    }
                }
                if (count >= n) {
                    count2++;
                }
            }
            count = 0; //

        }
        return count2;
    }

    static String reverseEachWordInString(String s) {
        String s2 = "";
        String[] a = s.split(" ");
        int len = a.length;
        for (int i = 0; i < len; i++) {
            String s3 = "";
            for (int j = 0; j < a[i].length(); j++) {
                s3 = s3 + a[i].charAt(a[i].length() - j - 1);
            }
            s2 = s2 + s3;
        }
        return s2;
    }

    static void gen(int n, int m) {
        for (int i = n; i < m + 1; i++) {
            System.out.println(i + ". ");
        }
    }

    static String reverseWordsInSentence(String s) {
        String[] a = s.split(" ");
        int len = a.length;
        String s2 = "";
        for (int i = len - 1; i > -1; i--) {
            s2 = s2 + a[i] + " ";
        }
        return s2;
    }

    static String reverseStringsInSentence(String s) {
        int len = s.length();
        String s2 = "";
        String s3 = "";
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            s2 += c;
            if (c == ' ' || i == (len - 1)) {
                for (int j = s2.length() - 1; j > -1; j--) {
                    s3 += s2.charAt(j); // musi byc s2 i j !!!
                    if (i==(len - 1) && j == s2.length()-1){
                        s3 += " ";
                    }
                }

                s2 = "";
            }
        }
        return s3;
    }

    public static void main(String[] args) throws Exception {
        Graph graph = new Graph(4);
        graph.addEdge(0, 1, 43);
        graph.addEdge(0, 2, 11);
        graph.addEdge(1, 222, 432);
        graph.addEdge(2, 11, 12);
        graph.addEdge(3, 7, 493);

        System.out.println("aa");
        System.out.println(reverseStringsInSentence("1234 567 89 abcd efgh"));
        System.out.println("aa");

        graph.printGraph(graph);
        Queue q = new LinkedList();


        System.out.println();

        System.out.println("fff");
        isNumber('2');
        System.out.println("d");
        System.out.println("d");
        System.out.println("d");

        System.out.println(reverseWithStack("Ala ma kota"));
        System.out.println();
        System.out.println();
        System.out.println("--------");
        System.out.println(reverseInt(1234));
        System.out.println("xxxxxx");
        String words = "ala ma kota 12345, 123456, 234567 c";
//        System.out.println(countWords(words));

//        System.out.println(countWithAtLeastNCharacters(words, 4));
//        System.out.println(reverseEachWordInString("Ala ma kota"));

//        gen(292, 333);
//        String s3 = "Ala ma kota";
//        System.out.println(reverseWordsInSentence(s3));
    }

}

package Graphs;

import java.util.*;

public class Main {

    static class Graph {
        int V;
        List<Integer> list[];

        Graph(int V) {
            this.V = V;
            list = new LinkedList[V];

            for (int i = 0; i < V; i++) {
                list[i] = new LinkedList<>();
            }
        }

        void addEdge(int v, int w) {
            list[v].add(w);
        }

        void printGraph(Graph graph) {
            for (int i = 0; i < graph.V; i++) {
                System.out.println(i);
                for (Integer i2 : list[i]) {
                    System.out.println(i2);
                }
                System.out.println();
            }
        }



//        void BFS(int s) {
//
//            boolean visited[] = new boolean[V];
//
//
//            LinkedList<Integer> queue = new LinkedList<Integer>();
//
//
//            visited[s] = true;
//            queue.add(s);
//
//            while (queue.size() != 0) {
//
//                s = queue.poll();
//                System.out.print(s + " ");
//
//
//                Iterator<Integer> i = list[s].listIterator();
//                while (i.hasNext()) {
//                    int n = i.next();
//                    if (!visited[n]) {
//                        visited[n] = true;
//                        queue.add(n);
//                    }
//                }
//            }
//        }


        public static void main(String[] args) {
            Graph graph = new Graph(4);
            graph.addEdge(0, 1);
            graph.addEdge(0, 2);
            graph.addEdge(1, 222);
            graph.addEdge(2, 11);
            graph.addEdge(3, 7);
//            graph.BFS(3);


        }

    }
}


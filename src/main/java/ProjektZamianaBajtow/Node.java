package ProjektZamianaBajtow;

public class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree {
    Node root; //

    BinaryTree() {
        root = null;
    }



    Node search(Node node, int data) {
        if (node == null || data == node.data) {
            return node;
        }
        if (data < node.data) {
            return search(node.left, data);
        } else {
            return search(node.right, data);
        }
    }

    void search(int data){
        search(root, data);
    }
//    }
////    void add(BinaryTree node, int data){
////        node.root.left = new Node(data);

    Node insertRecursive(Node node, int data) {
        if (node == null) {
            node = new Node(data);
            return node; //
        }

        if (data < node.data) {
            node.left = insertRecursive(node.left, data);
        } else if (data > node.data) {
            node.right = insertRecursive(node.right, data);
        }
        return node;
    }

    void insert(int data) {
        root = insertRecursive(root, data);
    }

    void log2n(long n) {
        for (long i = 1; i <= n; i = i * 2) ;
    }

    void logn(int n) {
        for (int i = 1; i <= n; i++) ;
    }

    void n_to_2(int n) {
        int count=0;
        for (int i = 0; i < n + 1; i++) {
             count++;
            for (int j = 0; j < n + 1; j++) {
                count++;
            }
        }
        System.out.println(count);
    }

    void n_to_4(int n){
        int count=0;
        for (int i = 0; i < n + 1; i++) {
            count++;
            for (int j = 0; j < n + 1; j++) {
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < n; l++) {

                    }
                }
            }
        }

    }

    void log_3n(long n){
        for (long i = 1L; i < n; i=i*3) {

        }
    }

    void factorialFactor(int n){
        // time complexity O(n!) //po 13 zaczyna dlugo trwac
        for (int i = 1; i < n; i++) {
            factorialFactor(n-1);
        }
    }


    void printInorder(Node node)
    {
        if (node == null)
            return;


        printInorder(node.left);


        System.out.print(node.data + " ");


        printInorder(node.right);
    }
    void printPreorder(Node node)
    {
        if (node == null)
            return;


        System.out.print(node.data + " ");


        printPreorder(node.left);


        printPreorder(node.right);
    }

    void printPostorder(Node node)
    {
        if (node == null)
            return;


        printPostorder(node.left);


        printPostorder(node.right);


        System.out.print(node.data + " ");
    }
    void printInorder()    {     printInorder(root);   }
    void printPreorder(){
        printPreorder(root);
    }

    void printPostorder()  {     printPostorder(root);  }





    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(1);
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(3);
        binaryTree.root.right.left = new Node(4);
        binaryTree.root.right.left.left = new Node(5);
        System.out.println();
//        binaryTree.insert(11);
//        binaryTree.insert(22);
//        binaryTree.insert(33);
//        binaryTree.add(binaryTree, 6);

        System.out.println();

        binaryTree.search(3);


    }

}

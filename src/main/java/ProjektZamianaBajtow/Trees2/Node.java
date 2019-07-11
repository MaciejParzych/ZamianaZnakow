package ProjektZamianaBajtow.Trees2;

import java.math.BigDecimal;

public class Node {
    int data;
    Node left, right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class BinaryTree{
    Node root;
    BinaryTree(){
        root=null;
    }


    void printPreOrder(Node node){
        if (node==null){
            return;
        }

        System.out.println(node.data);
        printPreOrder(node.left);
        printPreOrder(node.right);
    }



    void printPreOrder(){
        printPreOrder(root);
    }

    void printInOrder(Node node){
        if (node==null){
            return;
        }
        printInOrder(node.left);
        System.out.println(node.data);
        printInOrder(node.right);
    }
    void printInOrder(){
        printInOrder(root);
    }

    String reverseString(String s){
        if (s.length()<=1){
            return s;
        }

        System.out.println(s);
        return reverseString(s.substring(1)) + s.charAt(0);
    }

    void printPostOrder(Node node){
        if (node==null){
            return;
        }

        printPostOrder(node.left);

        System.out.println(node.data);
        printPostOrder(node.right);

    }
    void printPostOrder(){
        printPostOrder(root);
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(1);
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(3);
        binaryTree.root.left.left=new Node(4);
//        binaryTree.root.left.left = new Node(4);
//        binaryTree.root.right.left = new Node(5);
//        binaryTree.root.right.right = new Node(6);
//        binaryTree.root.left.left.right = new Node(7);

        binaryTree.printInOrder();
        System.out.println();
        binaryTree.printPostOrder();

    }
}

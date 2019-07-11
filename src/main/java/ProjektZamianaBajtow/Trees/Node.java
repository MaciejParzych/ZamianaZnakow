package ProjektZamianaBajtow.Trees;

public class Node {
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
        left = right = null;

    }
}

class BinaryTree{
    Node root;
    BinaryTree(int data){
        root = new Node(data);
    }
    BinaryTree(){
        root = null;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root  =new Node(43);
        tree.root.left = new Node(32);
        tree.root.left.left=new Node(432);
        tree.root.right=new Node(432);
    }
}

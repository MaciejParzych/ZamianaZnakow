package TreeExc;

public class Node {
    int data;
    Node left, right;
    Node (int data){
        this.data = data;
    }
}
class BT {

    Node root;

    int findMinInBST(Node node){
        Node curr = node;
        while (curr.left != null){
            curr = curr.left;
        }
        return curr.data;
    }

    int findMaxInBST(Node node){
        Node curr = node;
        while (curr.right != null){
            curr = curr.right;
        }
        return curr.data;
    }

    void inOrder(Node node)
    {
        if (node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + "   ");
        inOrder(node.right);

    }

    public static void main(String[] args) {
        BT bt = new BT();
        bt.root = new Node(10);
        bt.root.left = new Node(4);
        bt.root.right = new Node(12);
        bt.root.left.left = new Node(2);
        bt.root.left.right= new Node(6);

        bt.inOrder(bt.root);
        System.out.println(bt.findMinInBST(bt.root));
        System.out.println(bt.findMaxInBST(bt.root));
        bt.inOrder(bt.root);
    }
}

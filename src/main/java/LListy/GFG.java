package LListy;
import java.util.*;


class Node
{
    int data;
    Node next;
    Node(int d) {data = d;
        next = null;}
}

class MergeLists
{
    Node head;

    public void addToTheLast(Node node)
    {
        if (head == null)
        {
            head = node;
        }
        else
        {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }


    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String args[])
    {


        MergeLists llist1 = new MergeLists();
        MergeLists llist2 = new MergeLists();

        // Node head1 = new Node(5);
        llist1.addToTheLast(new Node(1));
        llist1.addToTheLast(new Node(4));
        llist1.addToTheLast(new Node(9));
        llist1.addToTheLast(new Node(16));
        llist1.addToTheLast(new Node(22));
        llist1.addToTheLast(new Node(33));
        llist1.addToTheLast(new Node(44));
        llist1.addToTheLast(new Node(55));


        llist2.addToTheLast(new Node(2));
        llist2.addToTheLast(new Node(18));
        llist2.addToTheLast(new Node(45));
        llist2.addToTheLast(new Node(46));


        llist1.head = new Gfg().sortedMerge(llist1.head,
                llist2.head);
        llist1.printList();

    }
}

class Gfg
{

    Node sortedMerge(Node headA, Node headB)
    {


        Node dummyNode = new Node(0);


        Node tail = dummyNode;
        while(true)
        {


            if(headA == null)
            {
                tail.next = headB;
                break;
            }
            if(headB == null)
            {
                tail.next = headA;
                break;
            }


            if(headA.data <= headB.data)
            {
                tail.next = headA;
                headA = headA.next;
            }
            else
            {
                tail.next = headB;
                headB = headB.next;
            }


            tail = tail.next;
        }
        return dummyNode.next;
    }
}

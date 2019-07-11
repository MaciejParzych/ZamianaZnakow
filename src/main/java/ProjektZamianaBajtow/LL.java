package ProjektZamianaBajtow;



import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.*;
import java.util.Stack;
import java.util.concurrent.TimeUnit;

@WebService
@SOAPBinding
class LL {
    Node head; // zeby miec dostep w main-ie

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;

        }
    }


    void traverse() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    void addBefore(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void addAfterNode(Node prev, int data) {
        Node newNode = new Node(data);
        newNode.next = prev.next;
        prev.next = newNode;
    }

    void append(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }

        Node last = head;

        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
    }


    void removeLL() {
        head = null;
    }

//    void removeLast(){
//        Node last = head;
//        while (last.next.next != null){
//            last = last.next;
//        }
//        last.next=null;
//    }

    void removeLast() {
        Node n = head;
        while (n.next.next != null) {
            n = n.next;
        }
        n.next = null;

    }


    static String reverseWordsInSentence(String s) {
        String[] arr = s.split(" ");
        String[] arr2 = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[arr.length - i - 1];
        }
        String s2 = "";
        for (String i : arr2) {
            s2 += (i + " ");
        }
        return s2;
    }

    Node reverseLinkedList(Node node) {
        Node current = node;
        Node prev = null, next = null;
        while (current != null) {
            next = current.next;

            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    void removeSecond() {
        if (head == null) {
            return;
        }
        head.next = head.next.next;
    }

    void removeFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

//    void removeLast() {
//        Node last = head;
//        while (last.next.next != null) {
//            last = last.next;
//        }
//        last.next = null;
//    }


    void removeLast2() {
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last = null;
    }

    void removeSecondLast() {
        Node last = head;
        while (last.next.next.next != null) {
            last = last.next;
        }
        last.next = last.next.next;
    }

    void reverseLL(LL ll) {
        head = ll.reverseLinkedList(head);
    }

    void removeSecondNode() {
        head.next = head.next.next;
    }


    /// head 1 2 3 4 5 null
//    static Node reverse(Node node) {
//        if (node.next == null) {
//            return node;
//        }
//        // przechodzi przez 1,2,3,4 i 5 (bo po 5 jest null)
//            Node ret = reverse(node.next);
//    }


//    void deleteNth(int n) {
//        Node last = head;
////        while (n>1){
////            last=last.next;
////            n--;
////        }
//        System.out.println(last.next.data);
//    }

    boolean detectLoop() { // "head"
        Set s = new HashSet();
        Node h = head;
        while (h != null) {
            if (s.contains(h)) { // jezeli h jest juz w secie to oznacza ze zawiera, sprawdza obiekty, a nie wartosci
                return true;
            }
            s.add(h); // dodanie noda
            h = h.next;
        }
        return false;

    }

    void swapSecondElement(int data) {
        Node newNode = new Node(data);
        newNode.next = head.next.next;
        ;
        head.next = newNode;

    }

//    Node merge(Node a, Node b) {
//        if (a == null) {
//            return a;
//        }
//        if (b == null) {
//            return b;
//        }
//        if (a.data < b.data) {
//            a.next = merge(a.next, b);
//            return a;
//        } else {
//            b.next = merge(a, b.next);
//            return b;
//        }
//
//    }


    static class C {
        Node merge(Node head1, Node head2) {
            Node dummyNode = new Node(0);
            Node tail = dummyNode;
            while (true) {
                if (head1 == null) {
                    tail.next = head2;
                    break;
                }
                if (head2 == null) {
                    tail.next = head1;
                    break;
                }
                if (head1.data <= head2.data) {
                    tail.next = head1;
                    head1 = head1.next;
                } else {
                    tail.next = head2;
                    head2 = head2.next;
                }
                tail = tail.next;


            }
            return dummyNode.next;
        }
    }

    void swapThirdFromTheEndAndDeleteRest() {
        Node n = head;
        while (n.next.next.next.next != null) {
            n = n.next;
        }
        n.next.data = head.next.data;
        n.next.next = null;
    }


//    void deleteNth(int count){
////        Node n = head;
////        while (count>1){
////            n=n.next;
////            count--;
////        }
////        System.out.println(n.data);
////        n.next=n.next.next;
////    }

    void deleteNth(int count) {

    }

    int findLengthIteratively() {
        Node n = head;
        int count = 0;
        while (n != null) {
            count++;
            n = n.next;
        }
        return count;
    }

    int findLengthIteratively2() {
        Node n = head;
        int count = 1;
        while (n.next != null) {
            count++;
            n = n.next;
        }
        return count;
    }

    int findLengthRecursively(Node node) {
        if (node == null) { // dopoki node nie jest nullem to przechodz do nastepnego (node.next)
            return 0;
        } else {
            return findLengthRecursively(node.next) + 1;
        }
    }

    int findLengthRecursively() {
        return findLengthRecursively(head);
    }

    int binarySearch(int[] a, int searched, int left, int right) {
        if (left <= right) {
            int mid = (left + right) / 2; // (jezeli bedzie np left+right/2) to bedzie blad
            if (a[mid] == searched) {
                return mid;
            }
            if (searched < a[mid]) {
                return binarySearch(a, searched, left, (mid - 1));
            }
            if (searched > a[mid]) {
                return binarySearch(a, searched, (mid + 1), right);
            }
        }
        return -1;
    }

    int binarySearch(int[] a, int searched) {
        return binarySearch(a, searched, 0, a.length - 1);
    }

//    int binarySearch(int arr[], int l, int r, int x)
//    {
//        if (r >= l) {
//            int mid = l + (r - l) / 2;
//
//            // If the element is present at the
//            // middle itself
//            if (arr[mid] == x)
//                return mid;
//
//            // If element is smaller than mid, then
//            // it can only be present in left subarray
//            if (arr[mid] > x)
//                return binarySearch(arr, l, mid - 1, x);
//
//            // Else the element can only be present
//            // in right subarray
//            return binarySearch(arr, mid + 1, r, x);
//        }
//
//        // We reach here when element is not present
//        // in array
//        return -1;
//    }

    void swapThirdFromTheEnd(int data) {
        Node newNode = new Node(data);
        Node n = head;
        while (n.next.next.next.next != null) {
            n = n.next;
        }
        Node temp = n.next.next;
        n.next = newNode;
        newNode = temp.next;

    }

    void deleteThirdElementFromTheEnd(int data) {
        Node newNode = new Node(data);
        Node n = head;
        while (n.next.next.next.next != null) {
            n = n.next;
        }
        n.next = n.next.next;
    }


    void swapThirdFromTheEnd() {

    }

    void addSecondElement(int data) {
        Node newNode = new Node(data);
        newNode.next = head.next;
        head.next = newNode; // musi byc head.next
    }

//    void append(int data){
//
//    }

    void remove(int data) {
        Node n = head;
        while (n.next != null && n.next.data != n.data) {
            n = n.next;
        }
        n = n.next;
    }

    // swap second element from last whith third from last

    // 7 -> 11 -> 8 -> 9 -> 14 -> null
    // 7 -> 11 -> 9 -> 8 -> 14 -> null
    void swapSecondElementFromEndWithThirdFromEnd() {
        Node n = head;
        int temp = 0;
        while (n.next.next.next != null) {
            n = n.next;
//            temp = n.data;

        }
//        temp = n.next.data;

        n.next.data = n.data;
        n.data = n.next.data;
    }

    // swap second element from last whith 22
    void swapSecondElementFromLastWithThird() {
        Node newNode = new Node(22);
        Node n = head;
        while (n.next.next.next != null) {
            n = n.next;
        }

        n.next.data = n.next.data + n.data;
        n.data = n.next.data - n.data;
        n.next.data = n.next.data - n.data;
    }

    void removeSpecified(int data) {
        Node n = head;
        while (n != null && n.next.data != data) {
            n = n.next;
        }
        n.next = n.next.next;
    }

    int findMiddleInOnePass() {
        Node fast = head, mid = head;
        int temp = 0;
        while (fast != null && fast.next != null) {

            fast = fast.next.next;
            mid = mid.next;
            temp = mid.data;

        }
        return temp;
    }


    int findMissingNumber(int[] a, int n) {
        int total = (n + 1) * (n + 2) / 2;  // wzor na sume liczb
        for (int i = 0; i < n; i++) {
            total -= a[i];
        }
        return total;
    }

    static int findMissingNumber2(int[] a, int n) {
        int sum = 0;
        for (int i = 1; i < n + 2; i++) {
            sum += i;
        }
        int sum2 = 0;
        for (int j = 0; j < n; j++) {
            sum2 = sum2 + a[j];
        }
        return sum - sum2;

    }

    void removeThirdNode() {
        Node n = head;
        n.next.next = n.next.next.next;
    }

    // 2->4->6->3->7->11->2->null
    //  x  = 5
    // 2->4-->3-->2->null
    void deleteAllNumbersGreaterThanX(Node n, int x) {
//        Node n = head;
        while (n.next != null) {
            if (n.next.data >= x) {
                n.next = n.next.next;
            }
            n = n.next;
        }
    }

    void count() {
        for (int i = 1; i < 12; i++) {
            System.out.println(i + ". ");
            System.out.println();
            System.out.println();
            if (i % 10 == 0) {
                System.out.println(" ");
                System.out.println(" ");
            }
        }
    }


    void removeThirdAndFifth() {
        Node n = head;
        head.next.next = head.next.next.next;
        head.next.next.next = head.next.next.next.next;
    }

    void removeThirdAndFifthFronTheEnd() {

        Node n = head;
        while (n.next.next.next != null) {
            n = n.next;
        }
        n.next = n.next.next;

    }

    int[] removeDup(int[] a) {
        int len = a.length;
        int[] a2 = new int[len];
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (a[i] != a[j]) {
                    a2[j] = a[i];
                }
            }
        }
        System.out.println(Arrays.toString(a2));
        return a2;
    }

    int[] findIntegerThatMultiplyToN(int[] a, int n) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                for (int k = j + 1; k < len; k++) {
                    if ((a[i] * a[j] * a[k]) == n) {
                        return new int[]{a[i], a[j], a[k]};
                    }
                }
            }
        }
        return null;
    }

//    static public  int[] twoSum(int[] nums, int target) {
//
//        int arr[] = new int[2];
//
//        int len = nums.length;
//
//        for (int i = 0 ; i < len; i++){
//            for (int j =i+1; j < len; j++){
//
//                if ((nums[i] + nums[j]) ==target){
//                    arr[0] = i;
//                    arr[1] = j;
//
//                    return arr;
//                }
//            }
//
//        }
//
//        return arr;
//    }

    static int[] minusTo(int[] a, int n) {
        int len = a.length;
        int[] a2 = new int[2];
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {

                if ((a[i] - a[j]) == n) { // jezeli pierwszy - drugi = n
                    a2[0] = i;
                    a2[1] = j;
                    return a2;
                }
                if ((a[j] - a[i]) == n) { // jezeli drugi - pierwszy = n

                    a2[0] = i;
                    a2[1] = j;
                }
            }
        }
        return a2;
    }

    static int exponentN(int x, int y) {
        int sum = 1;
        for (int i = 0; i < y; i++) {
            sum = sum * x;
        }
        return sum;
    }

    static int exponentToN(int[] a, int x, int y) {
        int len = a.length;
        for (int i = 0; i < len; i++) {

            if (exponentN(a[i], y) == x) {
                return i;
            }
        }
        return -1;
    }

    boolean twoMultiples(int[] a, int sum) {
        int len = a.length;
        Set set = new HashSet();

        for (int i = 0; i < len; i++) {
            int temp = sum / a[i]; // obliczanie jaka musi byc liczba zeby dodana sama do tej liczby byla suma
            if (set.contains(temp)) { // jezeli set zawiera ta liczbe to zwroc true
                return true;
            }
            set.add(a[i]); // musi byc tutaj, bo jezeli byloby wczesniej to zwrociloby wynik dodawania do samej siebie
        }
        return false;

    }

    int fib(int n) {
        int a = 0, b = 1, sum = 0;
        for (int i = 0; i < n; i++) {
            a = b;
            b = sum;
            sum = a + b;
        }
        return sum;
    }

    int fibonacciIteratively(int n) {
        int a = 0, b = 1, sum = 0;
        for (int i = 1; i < n; i++) { // n zamiast n+1
            // 0, 1, 1, 2, 3
            // a to 0, b to 1, kolejny element to suma tych elementow, czyli a+b.
            // 0, 1, 1
            // teraz a to kolejny element (b), a b to też kolejny element(suma)
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }


    void removeLoop() {
        Node n = head, temp = null;
        Set set = new HashSet();
        while (n != null) {
            if (set.contains(n)) {
                break;
            }
            set.add(n);
            temp = n;
            n = n.next;
        }
        temp.next = null;
    }

    static Node findIntersection(Node head, Node head2) {
        Node n = head;
        Node n2 = head2;
        Set set = new HashSet();

        while (n != null) {
            set.add(n);
            n = n.next;
        }
        while (n2 != null) {
            if (set.contains(n2)) { // sprawdzenie czy set (pierwsza linked lista) zawiera element z drugiej linked listy ,,, set.contains(n2), a nie set2.contains(n)
                break;
            }
            n2 = n2.next;
        }
        return n2;
    }

    static boolean isStringPalindrom(String s) {
        int len = s.length();
        Stack<Character> stack = new Stack(); // jezeli nie bedzie <Character> to nie bedzie dzialac
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            stack.push(c);
        }
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    static int returnSpace(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                count++;
            }
        }
        return count;
    }

    LL mergeLL(Node head1, Node head2) {
        LL ll3 = new LL();
        Node n = head1;
        Node n2 = head2;


        while (true) {
            if (n == null) {
//                tail.next = n2;
                ll3.append(n2.data);
                break;
            }
            if (n2 == null) {
                ll3.append(n.data);
                break;
            }

            if (n.data <= n2.data) {
                ll3.append(n.data);
                n = n.next;
            } else {
                ll3.append(n2.data);
                n2 = n2.next;
            }
        }

        return ll3;
    }

    Node sortedMerge(Node headA, Node headB) {

    /* a dummy first node to
       hang the result on */
        Node dummyNode = new Node(0);

    /* tail points to the
    last result node */
        Node tail = dummyNode;
        while (true) {

        /* if either list runs out,
        use the other list */
            if (headA == null) {
                tail.next = headB;
                break;
            }
            if (headB == null) {
                tail.next = headA;
                break;
            }

        /* Compare the data of the two
        lists whichever lists' data is
        smaller, append it into tail and
        advance the head to the next Node
        */
            if (headA.data <= headB.data) {
                tail.next = headA;
                headA = headA.next;
            } else {
                tail.next = headB;
                headB = headB.next;
            }

            /* Advance the tail */
            tail = tail.next;
        }
        return dummyNode.next;
    }

    Node merge(Node head1, Node head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        if (head1.data < head2.data) {
            head1.next = merge(head1.next, head2);
            return head1;
        } else {
            head2.next = merge(head1, head2.next);
            return head2;
        }

    }

    public int singleNumber(int[] a) {
        Map<Integer, Integer> m = new HashMap();
        int len = a.length;
        for (int i = 0; i <len;i++){
            if (! m.containsKey(a[i])){ // musi byc containsKey a nie  contains() bo w Mapach nie istnieje contains()
                m.put(a[i], 1);
            }
            else {
                m.put(a[i], m.get(a[i]) + 1);
            }
        }
        for (int i = 0; i < len; i++) {

            if (m.get(a[i]) != 2){
                return i;
            }
        }
        return -1;

    }

    int findLength(Node node, int n){
        if (node == null){
            return 0;
        }
        else if (node.data > n){
            return findLength(node.next, n) + 1;
        }
        else {
            return findLength(node.next, n);
        }
    }
    static void fizz(int n, int m) {
        if (n > m) {
            return;
        }
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (n % 3 == 0) {
            System.out.println("Fizz");
        } else if (n % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(n);
        }
        fizz(n + 1, m);
    }

    static void fizzBuzz(int n){
        fizz(0, n);
    }

    static boolean isRotated(int[] a){
        int len = a.length;
        if (len == 1){
            return true; // co jesli jest tylko jeden element
        }
        int count = 0;
        for (int i = 1; i < len; i++){
            if (a[i - 1] > a[i]){
                count++;
            }
        }
        return count == 1;
    }



    public static void main(String[] args) {

//        fizzBuzz(120);
        int[] a = {4,5,6,7,1,2,3,5};
        System.out.println(isRotated(a));

        LL ll = new LL();
        ll.head = new Node(1);
        ll.head.next = new Node(4);
        ll.head.next.next = new Node(9);
        ll.head.next.next.next = new Node(16);
        ll.head.next.next.next.next = new Node(22);
        ll.head.next.next.next.next.next = new Node(33);
        ll.head.next.next.next.next.next.next = new Node(44);
        ll.head.next.next.next.next.next.next.next = new Node(55);

//        ll.head.next.next.next.next = ll.head.next;
//        ll.removeLoop();

        System.out.println(ll.findLength(ll.head, 17));


//        LL ll2 = new LL();


//        ll2.head = new Node(2);
//        ll2.head.next = new Node(18);
//        ll2.append(555);

//        Node node = (new LL()).mergeLL(ll.head, ll2.head);
//        ll.head = (new LL()).sortedMerge(ll.head, ll2.head);

//        ll.head = (new LL()).mergeLL(ll.head, ll2.head);

//        LL ll4 = (new LL()).mergeLL(ll.head, ll2.head);

//        ll4.traverse();

//        ll.traverse();
//        System.out.println("-----");
//        ll2.traverse();

//        System.out.println("---111");
//        System.out.println(findIntersection(ll.head, ll2.head).data);


//        System.out.println(ll.fib(10));
//        System.out.println(ll.fibonacciIteratively(10));


//        int a = 4;
//        int b = 5;
//        for (int i = 0; i < 10; i++) {
//            b =+ a; // b = (+a)
//        }
//        System.out.println(b); // 4

//        ll.deleteAllNumbersGreaterThanX(head,5);
//        ll.traverse();
//        ll.count();

//        ll.swapThirdFromTheEnd(333);
//        ll.addSecondElement(555);
//        ll.traverse();
//        int[] a = {3, 33, 2, 3, 2, 1, 3, 4, 5, 9, 3, 2, 1};
//        System.out.println(Arrays.toString(ll.removeDuplicates(a)));
//
//        System.out.println(Arrays.toString(ll.removeDuplicates2(a)));


//        System.out.println(exponentN(4,3));

//        int[] b = {4, 11, 1, 27, 3, 33, 9}; // 7
//        System.out.println(Arrays.toString(b));

//        System.out.println(ll.twoMultiples(b,81));

//        System.out.println(exponentToN(b, 27, 4));

//        System.out.println(ll.findMissingNumber(b, b.length));
//        System.out.println(ll.findMissingNumber2(b, b.length));
//        System.out.println(findMissingNumber2(b, b.length));


//        System.out.println(ll.findLengthIteratively());
//        System.out.println(ll.findLengthRecursively());
//        int[] a = {1, 4, 3, 4, 5, 6, 7, 82, 3, 3, 9, 10, 11};
//        ll.removeDup(a);
//        System.out.println(ll.binarySearch(a, 5));
//        System.out.println(ll.binarySearch(a, 81, 0, a.length-1));
//        System.out.println(ll.binarySearch(a, 0, a.length-1, 2));

//        ll.traverse();
//        System.out.println();
//        System.out.println();
//        ll.deleteNth(2);
//        System.out.println();
//
//        ll.traverse();
//        ll.traverse();

//        LL ll2 = new LL();
//        ll2.head = new Node(3);
//        ll2.head.next = new Node(4);
//        ll2.head.next.next = new Node(6);

//        ll.head = ll.merge(ll.head, ll2.head);
//        ll.head = ll.merge(ll.head, ll2.head);
//        LL ll3 = new LL();
//        ll3.head = ll.merge(ll.head, ll2.head);

//        ll3.head = ll.SortedMerge(ll.head, ll2.head);


//        ll3.traverse();

//        ll.head  = (new C()).merge(ll.head, ll2.head);
//        ll.printList();

//        ll.head.next = ll.head;
//
//        System.out.println(ll.detectLoop());
//        System.out.println();
//        System.out.println();

//        ll.traverse();
    }

    int[] removeDuplicates(int[] a) {
        int len = a.length;
        int[] a2 = new int[len];
        Set<Integer> set = new LinkedHashSet();
        for (int i = 0; i < len; i++) {
            set.add(a[i]);
        }
        int count = 0;
        for (int i : set) {
            a2[count++] = i;

        }
        return a2;
    }

    int[] removeDuplicates2(int[] a) {
        int len = a.length;
        int[] a2 = new int[len];

        Arrays.sort(a);

        for (int i = 1; i < len; i++) {
            if (a[i - 1] != a[i]) {
                a2[i] = a[i];
            }
        }
        return a2;
    }

    public Node SortedMerge(Node A, Node B) {

        if (A == null) return B;
        if (B == null) return A;

        if (A.data < B.data) {
            A.next = SortedMerge(A.next, B);
            return A;
        } else {
            B.next = SortedMerge(A, B.next);
            return B;
        }
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}

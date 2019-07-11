//package ProjektZamianaBajtow.Trees2;
//
//
//public class Queue {
//    int capacity = 5;
//    int front, rear;
//    int[] arr;
//    int size;
//
//    Queue() {
//        front = rear = 0;
//        arr = new int[capacity];
//    }
//
//    void enqueue(int data) {
//        arr[rear++] = data;
////        rear = rear+1 ;
//        size++;
//    }
//
//
//    int dequeue() {
//        int data = arr[front];
//        front=front+1; //
//        size--; //
//
//        return data;
//    }
//
//    void swap(int[] a, int i, int j){
//        int temp = a[i];
//        a[i] = a[j];
//        a[j] = temp;
//    }
//
//    void show() {
//
//        for (int i = 0; i < size; i++) {
//            System.out.println(arr[front+i]); // !!!
//        }
//        System.out.println();
//
//        for (int n: arr){
//            System.out.println(n);
//        }
//
//    }
//
//
//    public static void main(String[] args) {
//
//        Queue q = new Queue();
//        q.enqueue(5);
//        q.enqueue(2);
//        q.enqueue(7);
//        q.enqueue(3);
//
//        q.dequeue();
//
//        System.out.println(q.dequeue());
//
//
//        System.out.println();
//        q.enqueue(7);
////        q.enqueue(3);
////
////
////        q.enqueue(13);
////        q.enqueue(33);
//
//
//        q.show();
//
//    }
//
//    int partition(int[] arr, int low, int high) {
//        int pivot = arr[high];
//        int i = (low - 1); // index
//        for (int j = low; j < high; j++) {
//            if (arr[j] <= pivot) {
//                i++;
//
//                // swapping
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//
//            }
//        }
//        int temp = arr[i + 1];
//        arr[i + 1] = arr[high];
//        arr[high] = temp;
//
//        return i + 1;
//    }
//
//
//    void sort(int[] arr, int low, int high) {
//        if (low < high) {
//            int pi = partition(arr, low, high);
//            sort(arr, low, pi - 1);
//            sort(arr, pi + 1, high);
//        }
//    }
//
//
//    //    void dequeue() {
////        for (int i = 0; i < rear - 1; i++) {
////            arr[i] = arr[i + 1];
////        }
////
////        rear--;
////    }
//
//}

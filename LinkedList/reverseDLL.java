
import java.util.Stack;
class Node {

    int data;
    Node next;
    Node back;

    Node(int data, Node next, Node back) {
        this.data = data;
        this.next = next;
        this.back = back;

    }

    Node(int data) {
        this.data = data;
        this.next = null;
        this.back = null;

    }

}

public class reverseDLL {

    public static Node reverse2stepMethod(Node head) {
Node temp = head;
       Stack<Integer> myStack = new Stack<Integer>();
        while(temp!= null){
            myStack.push(temp.data);
            temp = temp.next;
        }
    temp = head;
         while(temp != null){
            temp.data = myStack.peek();
            myStack.pop();
            temp = temp.next;
        }

        return head;
    }


     private static Node reverseOptimal(Node head) {    
         Node temp = head;
       Node prev = null;
        while(temp!= null){
            prev = temp.back;
            temp.back = temp.next;
            temp.next = prev;
              temp = temp.back;
        }
   if (prev != null) {
        head = prev.back;
    }
        
        return head;
    }

    private static Node DLLtoArray(int arr[]) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    private static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;

        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 3, 1};
        Node head = DLLtoArray(arr);
        print(head);
        head = reverse2stepMethod(head);
        print(head);
        head = reverseOptimal(head);
        print(head);
    }
}


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

public class DLL {

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

    private static Node deleteHead(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;
        return head;
    }

    private static Node deleteTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {

            temp = temp.next;
        }
        Node tail = temp.next;
        temp.next = null;
        tail.back = null;

        return head;
    }

    private static Node deleteK(Node head, int k) {
        if (head == null) {
            return null;
        }
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            if (count == k) {
                break;
            }
            temp = temp.next;
        }

        Node prev = temp.back;
        Node front = temp.next;

        if (prev == null && front == null) {
            return null;
        } else if (prev == null) {
            head = deleteHead(head);
        } else if (front == null) {
            head = deleteTail(head);
        } else {
            prev.next = front;
            front.back = prev;
            temp.next = null;
            temp.back = null;
        }
        return head;
    }

    private static void deleteGivenNode(Node temp) {
        Node prev = temp.back;
        Node front = temp.next;
        if (front == null) {
            prev.next = null;
            temp.back = null;
            return;
        }
        prev.next = front;
        front.back = prev;
        temp.next = temp.back = null;

    }

    private static Node insertBeforeHead(Node head, int val) {
        Node newHead = new Node(val, head, null);
        head.back = newHead;
        return newHead;
    }

    private static Node insertBeforeTail(Node head, int val) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node prev = temp.back;
        Node newNode = new Node(val, temp, prev);
        temp.back = newNode;
        prev.next = newNode;
        return head;
    }

    private static Node insertBeforeKthNode(Node head, int val, int k) {
        if (k == 1) {
            return insertBeforeHead(head, val);
        }
        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            if (count == k) {
                break;
            }
            temp = temp.next;
        }
        Node prev = temp.back;
        Node newNode = new Node(val, temp, prev);
        temp.back = newNode;
        prev.next = newNode;
        return head;
    }
 private static void insertBeforeGivenNode(Node node , int val){
    Node prev = node.back;
    Node newNode = new Node(val,node,prev);
    prev.next = newNode;
    node.back = newNode;
 }
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 4};
        Node head = DLLtoArray(arr);
        print(head);
        // head = deleteHead(head);
        // print(head);
        // head = deleteTail(head);
        // print(head);
        // head = deleteK(head, 1);
        // print(head);
        // deleteGivenNode(head.next.next);
        // print(head);
        // head = insertBeforeHead(head,10);
        // print(head);
        // head = insertBeforeTail(head, 10);
        // print(head);
        // head = insertBeforeKthNode(head, 10, 3);
        // print(head);
         insertBeforeGivenNode(head.next , 5);
        print(head);



    }
}

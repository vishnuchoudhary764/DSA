
class Node {

    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

public class insertionAndDeletion {

    private static Node convertArrayToLL(int arr[]) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {

            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
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
        if (head == null) {
            return head;
        }
        Node temp = head;
        head = head.next;
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
        temp.next = null;
        return head;
    }

    private static Node deleteK(Node head, int k) {
        if (head == null) {
            return null;
        }
        if (k == 1) {
            Node temp = head;
            head = head.next;
            return head;
        }
        int count = 0;
        Node prev = null;
        Node temp = head;
        while (temp != null) {
            count++;
            if (count == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    private static Node deleteByVal(Node head, int val) {
        if (head == null) {
            return null;
        }
        if (head.data == val) {
            Node temp = head;
            head = head.next;
            return head;
        }
        Node prev = null;
        Node temp = head;
        while (temp != null) {
            if (temp.data == val) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    private static Node insertHead(Node head, int val) {
        Node temp = new Node(val, head);
        return temp;
    }

    private static Node insertLast(Node head, int val) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;

        }

        Node n = new Node(val);
        temp.next = n;

        return head;
    }

    private static Node insertAtK(Node head, int val, int k) {
        if (k == 1) {
            Node temp = head;
            head = new Node(val, head);
            head.next = temp;
            return head;
        }
        Node temp = head;
        int count = 1;
        while (temp != null) {
            count++;
            if (count == k ) {
                Node n = new Node(val, temp.next);
                temp.next = n;
                break;

            }
            temp = temp.next;

        }


        return head;
    }
      private static Node insertBeforeVal(Node head, int x,int val) {
        if (head == null) {
            return null;
        }
        if (head.data == x) {
         return new Node(val,head);
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == x) {
                Node n = new Node(val , temp.next);
                temp.next = n;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 6, 8};
        Node head = convertArrayToLL(arr);
        print(head);
        //  head = deleteHead(head);
        // print(head);
        // head = deleteTail(head);
        // print(head);
        //  deleteK(head,1);
        // print(head);
        // deleteByVal(head, 6);
        // print(head);
        //  head = insertHead(head, 1);
        // head = insertLast(head, 1);
        // head = insertAtK(head, 10, 3);
        // print(head);
        head = insertBeforeVal(head, 2, 4);
        print(head);

    }
}

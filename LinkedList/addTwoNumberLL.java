
import java.util.ArrayList;
import java.util.List;

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

public class addTwoNumberLL {

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

    private static Node addTwoNumbers(Node l1, Node l2) {
        Node t1 = l1;
        Node t2 = l2;
        int carry = 0;
        Node dummyNode = new Node(-1);
        Node curr = dummyNode;

        while (t1 != null || t2 != null) {
            int sum = carry;

            if (t1 != null) {
                sum = sum + t1.data;
                t1 = t1.next;
            }
            if (t2 != null) {
                sum = sum + t2.data;
                t2 = t2.next;
            }
            Node newNode = new Node(sum % 10);
            carry = sum / 10;
            curr.next = newNode;
            curr = curr.next;

        }

        if (carry != 0) {
            Node newNode = new Node(carry);
            curr.next = newNode;

        }

        return dummyNode.next;
    }

    private static Node oddEven(Node head) {
        List<Integer> list = new ArrayList();

        Node temp = head;
        while (temp != null) {
            list.add(temp.data);
            if (temp.next == null) {
                break;
            }
            temp = temp.next.next;
        }

        temp = head.next;
        while (temp != null) {
            list.add(temp.data);
            if (temp.next == null) {
                break;
            }
            temp = temp.next.next;
        }

        temp = head;
        int i = 0;
        while (temp != null) {
            temp.data = list.get(i);
            i++;
            temp = temp.next;
        }

        return head;
    }

    private static Node oddEvenOptimal(Node head) {
        Node odd = head;
        Node even = head.next;
        Node evenHead = head.next;

        if (head.next == null) {
            return head;
        }
        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    private static Node sortZerosOnesTwos(Node head) {
        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);

        Node zero = zeroHead;
        Node one = oneHead;
        Node two = twoHead;


        Node temp = head;
        while (temp != null) {
            if (temp.data == 0) {
                zero.next = temp;
                zero = zero.next;
            } else if (temp.data == 1) {
                one.next = temp;
                one = one.next;

            } else {
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }
       zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
         one.next = twoHead.next;
         two.next = null;
        head = zeroHead.next;
        return head;
    }
    

    public static void main(String[] args) {
        int arr1[] = {4, 2, 3, 1};
        int arr2[] = {2, 5, 6, 8};
        int arr3[] = {1,0,1,2,0,2,1};
        Node l1 = convertArrayToLL(arr1);
        Node l2 = convertArrayToLL(arr2);
        Node l3 = convertArrayToLL(arr3);

        // print(l1);
        // print(l2);
        print(l3);


    //     Node head = addTwoNumbers(l1, l2);
    //     print(head);
    //    Node head = oddEvenOptimal(l1);
    //     print(head);
       Node head = sortZerosOnesTwos(l3);
        print(head);

    }
}

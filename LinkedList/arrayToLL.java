class Node{
    int data;
    Node next;

     Node(int data , Node next) {
        this.data=data;
        this.next=next;
    }
     Node(int data) {
        this.data=data;
        this.next=null;
    }
    
};

public class arrayToLL {
    static void search(Node head , int val){
        Node temp = head;
        while(temp != null){
            if(temp.data == val){
            System.out.println("found");
            return;
            }
            temp = temp.next;

        }
         System.out.println("Not found");
    }
   private static Node convertArrayToLL(int arr[]){
Node head = new Node(arr[0]);
Node mover = head;
for (int i = 1; i < arr.length; i++) {
    
    Node temp = new Node(arr[i]);
    mover.next = temp ;
    mover = temp;
}
return head;
}
    public static void main(String[] args) {
  int arr[] = {2,5,6,8};
  Node head = convertArrayToLL(arr);

// Node temp = head;
// int count = 0;
// while(temp != null){
//     System.out.print(temp.data+" ");
// count++;
//     temp = temp.next;
// }
// System.out.println();
// System.out.println("length : "+count);

search(head,1);
    }
}
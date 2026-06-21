public class usingArray {
    public static void main(String[] args) {
  myStack ob1 = new myStack(4);
  ob1.push(1);
  ob1.push(2);
  ob1.push(3);
ob1.pop();
  ob1.push(4);
    ob1.peek();



    }
}
class myStack{
 private int size;
 private int top;
 private int[] arr;
 public myStack(int cap){
    size = cap;
    arr = new int[size];
    top = -1;
 }
 void push(int x) {
   
    if (top == size - 1) {
        System.out.println("Stack Overflow");
        return;
    }
   
    arr[++top] = x;
}
int pop() {
    
    if (top == -1) {
        System.out.println("Stack Underflow");
        return -1;
    }
    
    return arr[top--];
}
int peek() {
   
    if (top == -1) {
        System.out.println("Stack is Empty");
        return -1;
    }
   
    return arr[top];
}

}
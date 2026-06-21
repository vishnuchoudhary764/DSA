// class stringEx{
//     public static void main(String[] args) {
//       String greating = myGreat("vishnu patel");
//       System.err.println(greating);
//         String note = great();
//       System.err.println(note);

//     }
//     static String myGreat(String name){
//         String message = "Hello! "+name;
//         return message;
//     }
//     static String great(){
//        String note = "how are you";
//        return note;
//     }
// }


// class stringEx {

//     public static void main(String[] args) {
//         stringEx obj = new stringEx();
//         obj.great();
//         obj.myGreat("vishnu");
//     }

//     void myGreat(String name) {
//         String message = "Hello! " + name;
//         System.out.println(message);

//     }

//     void great() {
//         String note = "how are you";
//         System.out.println(note);
//     }
// }


class stringEx {

    public static void main(String[] args) {
        
        great();
       myGreat("vishnu");
    }

    static  void myGreat(String name) {
        String message = "Hello! " + name;
        System.out.println(message);

    }

    static void great() {
        String note = "how are you";
        System.out.println(note);
    }
}



public class Strings1 {

    public static void main(String[] args) {
        String firstname = "vishnu";
        String lastname = "patel";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);
        System.out.println(fullname.length());

        //charAt (to print all the character one by one)
        for (int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }
        //compare two strings
        if (firstname.compareTo(lastname) == 0) {
            System.out.println("strings are equal");
        } else {
            System.out.println("stringa are not equal");
        }

        //
         String sentence = "happybirthdaytoyou";
         String name = sentence.substring(0,13);
         System.out.println(name);
    }
}


public class Strings2 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("v");
        sb.append("i");//str = str+"i";
        sb.append("s"); //str = str+"s";
        sb.append("h"); //str = str+"h";
        sb.append("n"); //str = str+"n";
        sb.append("u"); //str = str+"u";   
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

    
    
        //set char at index 0
          sb.setCharAt(0, 'w');
          System.out.println(sb);


          sb.insert(0,'p');
          System.out.println(sb);

          sb.delete(2,3);
          System.out.println(sb);
     }
}


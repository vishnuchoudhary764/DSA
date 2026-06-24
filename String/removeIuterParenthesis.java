public class removeIuterParenthesis {
    static String remove(String s ){
          StringBuilder ans = new StringBuilder();
        int open = 0;
         for (char ch : s.toCharArray()) {

            if (ch == '(') {

                if (open > 0) {
                    ans.append(ch);
                }

                open++;
            }
            else {

                open--;

                if (open > 0) {
                    ans.append(ch);
                }
            }
        }

        return ans.toString();
    }
    public static void main(String[] args) {
    String s = "(()())(())";
    String ans = remove(s);
    System.out.println(ans);
    }
}
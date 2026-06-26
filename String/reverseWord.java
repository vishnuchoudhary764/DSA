
public class reverseWord {

    static String reverseWord(String s) {
        StringBuilder ans = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            //remove trailing spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            //check value of i
            if (i < 0) {
                break;
            }
            int j = i;
            // find the start index of word
            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }
            // jaise hi j space vale index pr aya, to rukk jyg
            //ab iss word ko ans me append krdo
            ans.append(s.substring(j + 1, i + 1));

              //remove faltu ke space in string
            while (j >= 0 && s.charAt(j) == ' ') {
                j--;
            }
            //add space after one word append in ans
            if (j >= 0) {
                ans.append(' ');
            }
            //place i at last index of remaining string
            i = j;
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "  hello world  ";
        String result = reverseWord(s);
        System.out.println(result);

    }
}

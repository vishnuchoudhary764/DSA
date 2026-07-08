public class permutation {
     static boolean compareFreq(int[] count1, int[] count2){
        for(int i =0;i<26;i++){
            if(count1[i] != count2[i]){
                return false;
            }
        }
        return true;
    }
    public static boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int count1[] = new int[26];
        for(int i =0;i<s1.length();i++){
            char ch = s1.charAt(i);
            int idx = ch - 'a';
            count1[idx]++;
        }
        int i =0;
        int wdw = s1.length();
         int count2[] = new int[26];
        for(i =0;i<wdw;i++){
            char ch = s2.charAt(i);
            int idx = ch - 'a';
            count2[idx]++;
        }
        
        if(compareFreq(count1 , count2) == true){
            return true;
        }
        else{
            while(i<s2.length()){
                char newChar = s2.charAt(i);
                int newIdx = newChar - 'a';
                count2[newIdx]++;


                 int oldCharIdx = i - wdw;
                 char oldChar = s2.charAt(oldCharIdx);
                 int foldchar = oldChar - 'a';
                 count2[foldchar]--;
                   if(compareFreq(count1 , count2) == true){
            return true;
        }
        i++;
            }
        }
    return false;

    }
    public static void main(String[] args) {
  String s1 = "dao";
  String s2 = "eidbaooo";
  System.out.println(checkInclusion(s1, s2));
    }
}
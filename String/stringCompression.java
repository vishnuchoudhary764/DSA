
public class stringCompression {

    public static int compress(char[] chars) {
       
        int readIdx = 0;       
        int writeIdx = 0; 

        while (readIdx < chars.length) {

            char currentChar = chars[readIdx];
            int count = 0;
      // counting duplicates
            while (readIdx < chars.length && chars[readIdx] == currentChar) {
                count++;
                readIdx++;
            }
      
      //now we have currentChar and uska count 
            chars[writeIdx] = currentChar;
            writeIdx++;

            if (count > 1) {
                String str = String.valueOf(count);

                for (char ch : str.toCharArray()) {
                    chars[writeIdx] = ch;
                    writeIdx++;
                }
            }
        }

        return writeIdx;
    }

    public static void main(String[] args) {
        char[] chars = {'a','a','b', 'b', 'c','c','c'};
        System.out.println(compress(chars));

    }
}

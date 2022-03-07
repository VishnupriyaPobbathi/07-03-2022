/**
 * This provides various utility methods for Strings.
 *
 * @author Vishnupriya
 * @version 1.0.0
 */
public class StringUtils {
    /**
     * Accepts a String and returns its reverse.
     * If you pass "PRIYA", this method returns "AYIRP".
     *
     * @param str Original String
     * @return reverse of Original String
     */
    public static String reverse(String str){
        //TODO: XYZ
        /*
        Convert the string to char array
        and traverse the array from end to finish.
         */
        String rev="";
        char c[]=str.toCharArray();
        for(int i=c.length-1;i>=0;i--){
            rev+=c[i];
        }
        return rev;
        //TODO: change above logic and use StringBuilder.
    }
}

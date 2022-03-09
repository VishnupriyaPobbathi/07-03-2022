package SelectionCodingChallenge;

/*
Write a logic using switch-case to print "EVEN" / "ODD" for the numbers.

Write a Java Program to solve Question 2 using ternary operator (?:).
 */
public class CodingChallenge03 {
    public static void main(String[]args){
        int number=5;
        String s=(number%2==0)?"EVEN" : "ODD";
        System.out.println("Number is:"+s);


    }
}

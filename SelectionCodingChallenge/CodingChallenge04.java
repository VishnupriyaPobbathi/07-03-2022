package SelectionCodingChallenge;

/*
Write a java program for following logic.
    if marks < 60, then print "Fail"
    if marks >= 60 but less than 90 , then print "Pass"
    if marks >= 90, then print "Passed with Distinction"

Write a Java Program to solve Question 1 using ternary operator (?:).
 */
public class CodingChallenge04 {
    public static void main(String[]args){
        int number=92;
        String s=(number<60)?"Fail":(number>=60 && number<90)?"Pass":"Distinction";
        System.out.println("You got" +s);
    }
}

package SelectionCodingChallenge;/*
Write a java program for following logic.
    if marks < 60, then print "Fail"
    if marks >= 60 but less than 90 , then print "Pass"
    if marks >= 90, then print "Passed with Distinction"
 */

public class CodingChallenge01 {
    public static void main(String[]args){
        byte marks=93;

        if(marks<60){
            System.out.println("Fail");
        }
        else{
            if(marks>=60 && marks<90){
                System.out.println("Pass");
            }else{
                System.out.println("Distinction");
            }
        }

    }
}

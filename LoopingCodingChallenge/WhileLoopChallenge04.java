package LoopingCodingChallenge;
/*
Write a program for following logic:
Print all the odd numbers in comma separated form from 1 till end (you may change it):
if end = 10, OUTPUT = 1, 3, 5, 7, 9
if end = 11, OUTPUT = 1, 3, 5, 7, 9, 11

You should use while loop and if - else statements. Note that, there should not be any comma after last digit.
 */
public class WhileLoopChallenge04 {
    public static void main(String[]args) {
        int num=5;
        int i=1;
        while(i<=num){
            if(i%2!=0) {
                System.out.print(i);
                if(num%2 == 0) {
                    if (i != (num - 1)) {
                        System.out.print(",");
                    }
                }
                    else{
                        if(i != num){
                            System.out.print(",");
                        }
                    }
            }
            i=i+1;
        }
    }
}

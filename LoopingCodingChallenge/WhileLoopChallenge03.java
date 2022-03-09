package LoopingCodingChallenge;

public class WhileLoopChallenge03 {
    public static void main(String[]args){
        int number=1;

        while(number<=100){
            if(number%2==0) {
                System.out.println("Even Numbers are:" + number);
            }
            number=number+1;

        }
    }
}

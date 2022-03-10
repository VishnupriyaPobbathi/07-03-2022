package JavaCodingChallenge03;
/*
Print the multiples of 5 starting from 200 to 5 with following restrictions:
1. Use for loop
2. Don't use modulus (%) operator to check whether number is divisible by 5 or not.
 */
public class Challenge04 {
    public static void main(String[]args){
        int sum;
        System.out.println("The numbers are: ");
        for(int i=200; i>=1; i=i-5){
                System.out.println(i);
        }
    }
}

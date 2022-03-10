package JavaCodingChallenge03;
/*
Write a Java program to print all the numbers between 1 and 100 (including 1 and 100)
which are divisible by 5.
 */
public class Challenge03 {
    public static void main(String[]args){
        System.out.println("The numbers are: ");
        for(int i=1; i<=100; i++){
            if(i%5==0){
                System.out.println(i);
            }
        }
    }
}

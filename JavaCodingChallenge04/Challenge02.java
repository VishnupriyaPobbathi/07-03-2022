package JavaCodingChallenge04;

public class Challenge02 {
    public static void main(String[]args){
        int i=0;
        while(i<=6){
            int j=1;
            while(j<=i) {
                System.out.print(i+1);
                j++;
            }
            System.out.println(i+1);
            i++;
        }
    }
}

package JavaCodingChallenge04;

public class Challenge04 {
    public static void main(String[]args){
        for(int i=1;i<=8;i++){
            for(int j=1;j<=8;j++){
                if((i+j)%2!=0){
                    System.out.print("B"+" ");
                }
                else{
                    System.out.print("W"+" ");
                }
            }
            System.out.println();
        }
    }
}

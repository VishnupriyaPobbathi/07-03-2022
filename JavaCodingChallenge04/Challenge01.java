package JavaCodingChallenge04;
/*
Print following output using nested for loops:
1
22
333
4444
55555
666666
7777777
 */
public class Challenge01 {
    public static void main(String[]args){
        for(int i=0;i<=6;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+1);
            }
            System.out.println(i+1);
        }
    }
}

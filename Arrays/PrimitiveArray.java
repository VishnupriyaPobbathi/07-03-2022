package Arrays;

public class PrimitiveArray {
    public static void main(String[]args){
        int[] scores;
        scores=new int[4];

        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);

        scores[0]=65;
        scores[1]=76;
        scores[2]=85;
        scores[3]=90;

        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);

       // scores[4]=100;
    }
}

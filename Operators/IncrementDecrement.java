package Operators;

public class IncrementDecrement {
    public static void main(String[]args){
        int i=5;
        int j=10;
        i++;
        --j;
        System.out.println("i="+i);//i=6
        System.out.println("j="+j);//j=9

        int result=i++ + --j;
        //step1: result=6+ --j and i=7, j=8
        //step2: result=6+8 and i=7, j=8
        System.out.println("result="+result);//result=6+8=14
        System.out.println("i="+i);
        System.out.println("j="+j);
    }
}

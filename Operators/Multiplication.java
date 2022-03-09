package Operators;

public class Multiplication {
    public static void main(String[]args){
        int i1=2;
        int i2=6;
        float f1=12.5f;
        double d1=50.0;

        int result1=i1*i2;
        float result2=i1*f1;
        double result3=i2*d1;

        System.out.println("result1 :"+result1);
        System.out.println("result2 :"+result2);
        System.out.println("result3 :"+result3);

        byte b1=10;
        byte b2=12;

        byte result4=(byte)(b1*b2);
        System.out.println("result4 :"+result4);

        i1=10000;//Re-assignment
        i2=500;
        result1=i1*i2;
        System.out.println("result1 :"+result1);
    }
}

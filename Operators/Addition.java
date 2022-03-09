package Operators;

public class Addition {
    public static void main(String[]args){
        int i1=10;
        int i2=20;
        float f1=35.5f;
        double d1=50.55;
        String str="HELLO ";
        int result1=i1+i2;//Operators.Addition, result of expression is int.
        float result2=i1+f1;//Operators.Addition, result of expression is float.
        double result3=i2+d1;//Operators.Addition, result of expression is double.
        String result4=str+f1;//Concatenation, result of expression is string.

        System.out.println("result1 :"+result1);
        System.out.println("result2 :"+result2);
        System.out.println("result3 :"+result3);
        System.out.println("result4 :"+result4);

        System.out.println("----------------------------");

        byte b1=12;//Implicit casting.
        byte b2=15;//Implicit casting.

        byte result5=(byte)(b1+b2);//casting is required.
        byte result6=(byte)(b1+0);//casting is required.
        byte result7=11+1;//no casting required as result of expression is within byte range.
        byte result8=(byte)(156+79);//casting is needed as result is out of range.
        //whenever you do explicit casting, there is a chance of losing some data.

        System.out.println("result5 :"+result5);
        System.out.println("result6 :"+result6);
        System.out.println("result7 :"+result7);
        System.out.println("result8 :"+result8);

    }
}

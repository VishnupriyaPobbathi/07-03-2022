package Operators;

public class RelationalOperators {
    public static void main(String[]args){
        byte b1=10;
        short s1=5;
        int i1=6;
        int i2=6;
        long l1=8;
        float f1=(float)6.0;
        double d1=6.0;
        char c1=6;

        System.out.println("b1==s1"+(b1==s1));
        System.out.println("i1==l1"+(i1==l1));
        System.out.println("i1==f1"+(i1==f1));
        System.out.println("i1==d1"+(i1==d1));
        System.out.println("f1==d1"+(f1==d1));
        System.out.println("i1==c1"+(i1==c1));

        System.out.println("i1==i2"+(i1==i2));
        System.out.println("i1==i2"+(i1!=i2));
        System.out.println("i1==i2"+(i1>=i2));
        System.out.println("i1==i2"+(i1<=i2));
    }
}

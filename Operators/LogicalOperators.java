package Operators;

public class LogicalOperators {
    public static void main(String[]args){
        char a1='A';
        char a2=65;
        int i1=5;
        int i2=15;

        boolean result1=(i1 == i2) && (a1 == a2);//F
        boolean result2=(i1 == i2) & (a1 == a2);//F & T=F
        System.out.println("result1="+result1);
        System.out.println("result2="+result2);

        //Logical OR and Bitwise Logical- inclusive OR
        boolean result3=(a1 == a2) || (i1 == i2);//T
        boolean result4=(a1 == a2) | (i1 == i2);//T | F=T
        System.out.println("result3="+result3);
        System.out.println("result4="+result4);

        //bitwise logical exclusive OR
        boolean result5=(a1 == a2) ^ (i1 == i2);//T ^ F=T
        boolean result6=(a1 == a2) ^ (i1 != i2);//T ^ T=F
        System.out.println("result5="+result5);
        System.out.println("result6="+result6);

        //Ternary Operator(?:)
        int time=12;
        String s=(time>=12) ? "PM" : "AM";
        System.out.println("S="+s);
    }

}

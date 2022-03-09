package Operators;

public class OperatorPrecedence {
    public static void main(String[] args){
        System.out.println(20-2-2);//20-4=16

        int a=10;
        a= --a + a++ + a-- + a++;
        //((9+9)+(a--))+(a++)
        //(18+10)+(a++)
        //28+9
        System.out.println("a="+a);//37

        a=1;
        a= -a-- + a++ / -a-- * --a;
        //(-1)+((0/(-1))*(--a))
        //(-1)+(0* (-1))
        //(-1)+(0)
        //-1
        System.out.println("a="+a);//-1

        a=2;
        boolean result= a++ ==2 || --a==2 && --a == 2;
        //(2==2)||(((--a)==2)&&((--a)==2))
        //true || ----
        //true
        System.out.println("result="+result);//true
        System.out.println(a);//3
    }
}

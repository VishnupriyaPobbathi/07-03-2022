package Operators;

public class AssignmentOperators {
    public static void main(String[]args){
        int i1=50;
        System.out.println(i1);

        i1+=1;
        System.out.println(i1);//50+1=51

        i1-=1;
        System.out.println(i1);//51-1=50

        i1*=3;
        System.out.println(i1);//50*3=150

        i1/=4;
        System.out.println(i1);//150/4=37

        i1%=4;
        System.out.println(i1);//37%4=1

    }
}

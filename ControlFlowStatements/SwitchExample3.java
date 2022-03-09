package ControlFlowStatements;

public class SwitchExample3 {
    public static void main(String[]args){
        byte var=65;
        final byte a=10;
        final byte b;
        b=20;
        switch (var){
            case a:
                System.out.println(1);
                break;
            case a * 5:
                System.out.println(2);
                break;
            /*case a*50:  //value 500, compile-time constant, within byte range
            System.out.println(3);
            break;
             */
            /*
            case b:  //not compile time constant
            System.out.println(4);
            break;
             */
            case '\u0041':
                System.out.println(5);
                break;
            /*
            case '\u20B9':  //Indian rupee symbol, decimal value 8377 byte range
            System.out.println(6);
            break;
             */
            default:
                System.out.println(7);
                break;
        }
    }
}

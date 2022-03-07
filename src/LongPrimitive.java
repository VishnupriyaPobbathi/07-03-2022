/**
 * class to show example of long primitive.
 *
 * @author Vishnupriya
 */
public class LongPrimitive {
    public static void main(String[]args){
        long lp1=5000L;//suffix L is optional
        System.out.println("lp1 is ="+lp1);

        long lp2=-5000;
        System.out.println("lp2 is="+lp2);

        long lp3=-1234556789L;//suffix L is compulsory, this number is out of int range.
        System.out.println("lp3 is="+lp3);

        long lp4=123456789L;//suffix L is compulsory, this number is out of int range.
        System.out.println("lp4 is="+lp4);

        long credit_card_number=1234_5678_6789_2345L;//suffix L is compulsory.
        //but you can have underscore to improve readability.
        System.out.println("Credit card number="+credit_card_number);
    }
}

/**
 * class to show examples of float and double primitive.
 *
 * @author Vishnupriya
 */
public class FloatDoublePrimitives {
    public static void main(String[]args){
        float fp1=3.1234f;//f is compulsory.
        System.out.println("Floating point 1st is:"+fp1);

        float fp2=31234-3F;//Scientific notation, f is compulsory.
        System.out.println("Floating point 2nd is:"+fp2);

        double dp1=1234.5E103;//D is optional.
        System.out.println("Double value of 1st is:"+dp1);

        double dp2=1234.3456678;//D is optional
        System.out.println("Double value of 2nd is:"+dp2);
    }
}

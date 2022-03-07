public class CharPrimitive {
    public static void main(String[]args){
        char cp1=86;//decimal value for V
        char cp2='V';//character V
        char cp3='\u0056';//unicode for V
        System.out.println("cp1 is:"+cp1);
        System.out.println("cp2 is:"+cp2);
        System.out.println("cp3 is:"+cp3);

        char cp4=8473;// decimal code for Double Struck Capital P
        char cp5='\u0c05';//unicode for struck capital P
        System.out.println("cp4 is:"+cp4);
        System.out.println("cp5 is:"+cp5);

        char cp6=65535;//no error
        System.out.println("cp6 is:"+cp6);

        //char cp7=65536;//compilation error

        //Assigning char literal to integral type.
        byte i1='V';//decimal value of V is 86.
        int i2='\u20B9';//Corresponding decimal value is 8377.
        System.out.println("i1 is:"+i1);
        System.out.println("i2 is:"+i2);
    }
}

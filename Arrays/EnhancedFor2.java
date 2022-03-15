package Arrays;

public class EnhancedFor2 {
    public static void main(String[]args){
        int[] numbers={10,20,30,40,50};
        System.out.println("--------------------------------");
        for(int x:numbers){
            System.out.print(x);
            System.out.print(",");
        }
        System.out.println("\n");
        System.out.println("Strings");
        System.out.println("---------------------------------");
        String[] names={"vishnu","sony","manju","raju"};

        for(String name:names){
            System.out.print(name);
            System.out.print(",");
        }
    }
}

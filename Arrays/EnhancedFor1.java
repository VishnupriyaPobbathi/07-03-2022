package Arrays;

public class EnhancedFor1 {
    public static void main(String[]args){
        int[] numbers={2,4,5,-3,8,6};
        int sum=0;

        for(int number:numbers){
            sum+=number;
        }
        System.out.println("Sum="+sum);
    }
}

package Arrays;

public class EnhancedFor4 {
    public static void main(String[]args){
        int[][] contents={{88,99,43},{56,76,89},{58,78,56}};

        System.out.println("Loop Using Enhanced for loop:");
        for(int[] eachRow:contents){
            for(int j:eachRow){
                System.out.print(j+"\t");
            }
            System.out.println("");
        }
    }
}

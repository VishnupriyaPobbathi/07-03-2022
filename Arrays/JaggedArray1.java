package Arrays;

public class JaggedArray1 {
    public static void main(String[]args){
        int r=5;
        int arr[][]=new int[r][];

        for(int i=0;i<arr.length;i++)
            arr[i]=new int[i+1];

        int count=0;
        for(int i=0;i<arr.length;i++)
            for(int j=0;j<arr[i].length;j++)
                arr[i][j]=count++;

        System.out.println("Contents of 2D Jagged Array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++)
                System.out.println(arr[i][j]+"");
            System.out.println();
        }
    }
}

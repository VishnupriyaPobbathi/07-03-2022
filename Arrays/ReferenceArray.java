package Arrays;

public class ReferenceArray {
    public static void main(String[]args){
        String [] names=new String[5];

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);

        names[0]="Lucky";
        names[1]="John";
        names[2]="Jack";
        names[3]="Katty";
        names[4]="Jho";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);

        //System.out.println(names[-1]);
    }
}

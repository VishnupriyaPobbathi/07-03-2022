package ControlFlowStatements;

public class NestedIfExample {
    public static void main(String[]args){
        int age=6;
        double height=55;

        if(age>=10){
            if(height>=45)
                System.out.println("You are eligible");
            }
        else
            System.out.println("Sorry You are not eligible");
    }
}

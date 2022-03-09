package ControlFlowStatements;

public class IfElseIfExample {
    public static void main(String[]args){
        byte hour=17;

        if(hour<12){
            System.out.println("Good Morning");
        }
        if(hour>=12 && hour<15)
        {
            System.out.println("Good Afternoon");
        }
        if(hour>=15)
        {
            System.out.println("Good Evening");
        }
    }
}

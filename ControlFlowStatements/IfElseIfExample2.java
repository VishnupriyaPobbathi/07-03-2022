package ControlFlowStatements;

public class IfElseIfExample2 {
    public static void main(String[]args) {
        byte hour = 12;

        if (hour < 12) {
            System.out.println("Good Morning");
        } else {
            if (hour >= 12 && hour < 15) {
                System.out.println("Good Afternoon");
            } else
            {
                System.out.println("Good Evening");
            }
        }
    }
}

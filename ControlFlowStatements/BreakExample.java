package ControlFlowStatements;

public class BreakExample {
    public static void main(String[]args){
        int upperbound=20;
        for(int i=1;i<=100000;i++){
            System.out.println(i);
        if(i==upperbound) {
            break;
        }
        }
    }
}

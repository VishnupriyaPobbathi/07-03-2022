package ControlFlowStatements;

public class ReturnExample {
    public static void main(String[]args){
        System.out.println("Loop Starts");
        for(int i=1;i<=10;i++){
        System.out.println(i);
        if(i==6){
            return;
        }
        }
        System.out.println("Loop ends");
    }
}

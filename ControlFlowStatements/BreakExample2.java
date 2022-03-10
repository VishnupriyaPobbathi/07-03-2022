package ControlFlowStatements;

public class BreakExample2 {
    public static void main(String[]args){
        int stopat=25;
        outer:
        for(int row=1;row<=100;row++){
            inner:
            for(int col=1;col<=10;col++){
                int num=row*col;
                System.out.print(num+"\t");
                if(num==stopat){
                    break outer;
                }
            }
            System.out.println();
        }
    }
}

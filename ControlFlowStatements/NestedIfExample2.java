package ControlFlowStatements;

public class NestedIfExample2 {
    public static void main(String[]args){
        int time=3;
        if(time>2)//1st if
            if(time>4)//2nd if
                if(time>6)//3rd if
                    System.out.println("A");
                else//3
                    System.out.println("B");
             else//2
                System.out.println("C");
    }
}

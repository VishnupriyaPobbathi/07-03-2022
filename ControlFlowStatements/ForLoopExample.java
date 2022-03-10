package ControlFlowStatements;

public class ForLoopExample {
    public static void main(String[]args){
       //while loop
        /*int count=1;
       while(count<5){
           System.out.println("Hello");
           count++;
       }*/
        //for loop syntax
        /*
        for(initialization_exprn;boolean_exprn;step_exprn){
            statement1;
            statement2;
            ...
         }
         */
        for(int count=0; count<2; count++){
            System.out.println("Hello");
        }
        //System.out.println(count);//error
        //OR
        System.out.println("----------------------");
        int i;
        for(i=0; i<5; i++){
            System.out.println("Hello");
        }
        System.out.println(i);

    }
}

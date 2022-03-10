package ControlFlowStatements;

public class DoWhileLoopExample {
    public static void main(String[]args){
        int count=0;

        do{
            System.out.println("Welcome");
            count=count+1;//
        }while(count<=2);//while(++count <2);
    }

    /*
     public static void main(String[]args){
        do{
            System.out.println("Welcome");
        }while(false);//o/p: Welcome //while(true);//o/p: infinite
    }
     */
}

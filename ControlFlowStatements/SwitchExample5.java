package ControlFlowStatements;

public class SwitchExample5 {
    public static void main(String []args){
        String color="G";
        //Java runtime will execute till last there is no break statements.
        switch(color){
            case "R":
                System.out.println("RED");
            case "B":
                System.out.println("BLUE");
            case "G":
                System.out.println("GREEN");
            case "O":
                System.out.println("ORANGE");
        }
    }
}

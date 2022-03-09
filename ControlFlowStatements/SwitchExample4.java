package ControlFlowStatements;

public class SwitchExample4 {
    public static void main(String []args){
        String color="Y";

        switch(color){
            case "R":
                System.out.println("RED");
                break;
            case "B":
                System.out.println("BLUE");
                break;
            case "G":
                System.out.println("GREEN");
                break;
            case "O":
                System.out.println("ORANGE");
                break;
            default:
                System.out.println("Invalid color");
                break;
        }
    }
}

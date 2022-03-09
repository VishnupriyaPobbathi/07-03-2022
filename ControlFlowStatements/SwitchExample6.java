package ControlFlowStatements;

public class SwitchExample6 {
    public static void main(String []args){
        String color="G";

        switch(color){
            case "R":
            case "r":
                System.out.println("RED");
                break;
            case "B":
            case "b":
                System.out.println("BLUE");
                break;
            case "G":
            case "g":
                System.out.println("GREEN");
                break;
            case "O":
            case "o":
                System.out.println("ORANGE");
                break;
            default:
                System.out.println("Invalid color");
                break;
        }
    }
}

package SelectionCodingChallenge;//Write a logic using switch-case to print "EVEN" / "ODD" for the numbers.

public class CodingChallenge02 {
    public static void main(String[]args){
        int number=7;
        switch(number%2){
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}

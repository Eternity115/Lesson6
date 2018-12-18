import TerminalIO.*;
public class Warmup1 {


    public static void main(String[] args) {
        KeyboardReader k = new KeyboardReader();
        /*
        Employees write 2 tests
        If they get >90 on Both: Manager
        If they get >90 on One: Supervisor
        If they get >70 on One, and under neither is under 50: Clerk
        */
        int score1, score2;
        score1 = k.readInt("Enter test score 1: ");
        score2 = k.readInt("Enter test score 2: ");
        
        if (score1>90 && score2>90){
            System.out.println("Qualified to be a Manager");
        }
        if (score1>90 || score2>90){
            System.out.println("Qualified to be a Supervisor");
        }
        if ((score1>70 || score2>70) && !(score1<=50 || score2 <=50)){
            System.out.println("Qualified to be a Clerk");
        }
        
    }
    
}

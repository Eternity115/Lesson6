
import TerminalIO.*;

public class TestEmployee {

    public static void main(String[] args) {
        Employee x = new Employee();
        KeyboardReader k = new KeyboardReader();
        while (true) {
            String nm = k.readLine("Enter name (enter to quit)> ");
            if (nm.equals("")) break;

            /*
            while (true){
                String nm = k.readLine("Enter name (" + x.getNameRules() + ", or enter to quit)> ");
                if (nm=="") break;
                if (x.setName(nm)){
                    System.out.println("The name is set to: '" + x.getName() + "'");
                    break;
                }
                else{
                   System.out.println("Error - try again!");
                    System.out.println("The name is currently '" + x.getName()+ "'");
                }    
            }
             */
            //set each property in a loop
            while (true) {
                int t = k.readInt("Enter type (" + x.getTypeRules() + ")> ");
                if (x.setType(t)) {
                    break;
                } else {
                    System.out.println("Error - try again");
                }
            }
            while (true) {
                int h = k.readInt("Enter hours (" + x.getHourRules() + ")> ");
                if (x.setHours(h)) {
                    break;
                } else {
                    System.out.println("Error - try again");
                }
            }
            while (true) {
                double r = k.readDouble("Enter rate (" + x.getRateRules() + ")> ");
                if (x.setRate(r)) {
                    break;
                } else {
                    System.out.println("Error - try again");
                }
            }
            //calculate pay
            double epay = x.getPay();
            System.out.format("Pay this week for %s is $%.2f\n", x.getName(), epay);
        }
        System.out.println("Thank you for using TestEmployee");

    }

}


public class Employee {
    private String name;
    private int type; //1=fulltime, 2=parttime
    private double rate;
    private int hours;
    
    public Employee(){ //this sets the characteristics (this is why you can go "Dice d = new Dice();", default settings)
        name="";
        type=0;
        rate=0;
        hours=0;
    }
    
    public String getTypeRules(){
        return "1 or 2";
    }
    
    public String getNameRules(){
        return "2 or more characters";
    }
    
    public String getRateRules(){
        return"between 6.75 and 30.05";
    }
    
    public String getHourRules(){
        return "between 1 and 60";
    }
    
    //setters: boolean
    //return true if property Can be set, false if not
    //will enforce rules from above
    
    public boolean setName(String nm){
        boolean badname = nm.length() <2;
        if (badname) return false;
        else{
            name = nm;
            return true;
        }
    }
    
    public boolean setType (int tp){
        boolean oneortwo = tp==1 || tp==2;
        if (!oneortwo) return false;
        else{
            type=tp;
            return true;
        }
    }
    
    public boolean setRate(double rt){
        boolean rateok = rt >=6.75 && rt <= 30.50;
        if (rateok){
            rate=rt;
            return true;
        }
        else return false;
    }
    
    public boolean setHours(int hrs){
        boolean hoursok = hrs>=1 && hrs<=60;
        if (hoursok){
            hours = hrs;
            return true;
        }
        else return false;
    }
    
    public String getName(){
        return name;
    }
    
    public double getPay(){
        double pay;
        boolean noovertime = hours<=40 || type==2;
        if (noovertime) return hours*rate;
        else{
            return (hours-40) * rate * 2 + 40*rate;
        }
    } 
    
    
}

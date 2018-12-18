
public class Patron {
    private String name;
    private Book b1, b2, b3;
    
    public Patron (String n){
        name = n;
        b1 = null;
        b2 = null;
        b3 = null;
    }

    public boolean borrow (Book b){
        if (b1==null){
            b1= b;
            return true;
        }
        if (b2==null){
            b2= b;
            return true;
        }
        if (b3==null){
            b3= b;
            return true;
        }
        return false;
    }
    public boolean hasBook(Book b){
        return(b1==b|| b2==b || b3==b);
    }

    public boolean returnBook(Book b){
        if (b1==b){
            b1=null;
            return true;
        }
        if (b2==b){
            b2=null;
            return true;
        }
        if (b3==b){
            b3=null;
            return true;
        }
        return false;
    }
    public String getName(){
        return name;
    }
}

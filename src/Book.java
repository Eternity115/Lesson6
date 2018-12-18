
public class Book {

    private final String author, title;

    public Book(String t, String a) {
        author = a;
        title = t;
    }
    
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
    
    public String toString(){
        
        String s = "===========================\n";
        s += "Title: \t" + title;
        s += "\nAuthor:\t" +author;
        s+= "\n";
        return s;
    }
}

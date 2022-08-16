public class Book {
    private String title;
    private int YOP;
    private long ISBN;
    private String Author;
    public String getTitle()
    {
        return title;
    }
 public void setTitle(String title){
        this.title = title;
 }
    public int getYOP() {
        return YOP;
    }

    public void setYOP(int YOP) {
        this.YOP = YOP;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}

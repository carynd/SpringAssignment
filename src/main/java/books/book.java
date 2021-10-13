package books;

import java.util.ArrayList;

public class book {
    private long book_id;
    private String name;
    private String author;

    private double stars;
    private String review;
     ArrayList <books_rev> list=new ArrayList<>();

    public book(String name, long book_id,String author){
        this.name=name;
        this.book_id=book_id;
        this.author=author;
    }

    public void addreview(long id,double stars, String review) {
       books_rev r1=new books_rev(id,stars,review);
       System.out.println(r1);
       list.add(r1);
    }

    public String toString(){

        return name+" "+book_id+" "+author;
    }

}

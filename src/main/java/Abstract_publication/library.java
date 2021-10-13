package Abstract_publication;

import Abstract_sorting.bubble_sort;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

public class library {
       static ArrayList <Abstract_class_publication> list=new ArrayList<>();

    public static void journal_Add(String name,int noofpages,String publisher,int price,String author) {
        Abstract_class_publication j1=new journals(name,noofpages,publisher,price,author);
        list.add(j1);


    }

    public static void book_Add(String name,int noofpages,String publisher,int price,String author) {
        Abstract_class_publication b1=new books(name,noofpages,publisher,price,author);
        list.add(b1);


    }

@Override
public String toString(){
        return super.toString();
}
    public static void main(String[] args) {


        library.book_Add("BAC",400, "publisher1" ,200, "Charles Dickens");
        library.book_Add( "hamlet",2000, "publisher2",300, "Shakespeak");
        library.book_Add( "water",2000, "publisher2",3000, "Kuvempu");
        library.journal_Add( "my_journey",340, "publisher3",300, "dara Bendre");
        library.journal_Add( "burning man",540, "publisher3",600, "leo tolstoy");
        System.out.println(list);

    }

}

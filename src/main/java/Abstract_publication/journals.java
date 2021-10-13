
package Abstract_publication;

public class journals extends Abstract_class_publication{

    private String jb="";
    private String au="";
    journals(String name,int noofpages,String publisher,int price,String author){
        super(noofpages,price,publisher);
        this.jb=name;
        this.au=author;
    }

@Override
    public String toString(){

        return "\n journal name:"+" "+jb+" "+"author:"+" "+au+" "+super.toString();
    }

}



package Abstract_publication;

public class books extends Abstract_class_publication{

    private String nb="";
    private String au="";
    books(String name,int noofpages,String publisher,int price,String author){
    super(noofpages,price,publisher);
    this.nb=name;
    this.au=author;
}

@Override
    public String toString(){

        return "\n book name:"+" "+nb+" "+"author:"+" "+au+" "+super.toString();
    }

}

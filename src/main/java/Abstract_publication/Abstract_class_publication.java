package Abstract_publication;

abstract class Abstract_class_publication  {
   private int np;
    private int pr;
    private String pn;

    public Abstract_class_publication(int noofpages, int price, String publisher) {
        this.np=noofpages;
        this.pr=price;
        this.pn=publisher;

    }

@Override
   public String toString(){

 return "noofpages:"+" "+np+"price:"+" "+pr+"publisher:"+" "+pn+" ";
   }



}

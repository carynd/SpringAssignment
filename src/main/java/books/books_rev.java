package books;

public class books_rev {

  public long id=0;
  public String review="";
  public double stars=0.0;


    public books_rev(long id,double stars, String review) {
        this.id = id;
        this.stars = stars;
        this.review = review;
    }
        public String toString(){
        return review+" "+stars;
    }





}

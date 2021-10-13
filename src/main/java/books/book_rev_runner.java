package books;

public class book_rev_runner {
    public static void main(String[] args) {
        book b1 = new book("hunger games", 1,"Charles d.");
        b1.addreview(1,4.0,"good reads");
        b1.addreview(2,5.0,"amazing");
        System.out.println(b1);
       // b1.book("hunger games",4,"good read");

    }

}

package OOPS_iitm;

class Author {
    protected static double royalty = 50;
    protected int booksWritten;

    public Author(int b) {
        booksWritten = b;
    }

    //since it is final so it cannot be overriden
    public final double calculateRoyalty() {
        return booksWritten * royalty;
    }
}

class FamousAuthor extends Author {
    public FamousAuthor(int b) {
        super(b);
    }

    public final double calculateRoyalty() { // LINE 1: error because it was a final class and couldnt be overriden
        return (booksWritten * royalty) + 1000; // LINE 2
    }
}

public class AuthorTest {
    public static void main(String[] args) {
        Author a1 = new FamousAuthor(5); // LINE 3
        FamousAuthor fa1 = new Author(7); // LINE 4:error becoz famousAuthor is a subclass of Author
        a1.calculateRoyalty();
        fa1.calculateRoyalty();
    }
}
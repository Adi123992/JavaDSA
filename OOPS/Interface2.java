class Book {
    String name;
    String[] authors;

    public Book(String nm, String[] a) {
        name = nm;
        authors = a;
    }

    public Book(Book b) {
        this.name = b.name;
        //this.authors=b.authors(); //shallow copy
        this.authors = b.authors.clone();//deep copy
    }
}

public class Interface2 {
    public static void main(String[] args) {
        String[] authors = {"Tagore", "Narayan", "Vikram"};
        Book b1 = new Book("Gita", authors);
        Book b2 = new Book(b1);
        Book b3 = b1;
        b2.name = "Nirmala";
        b2.authors[0] = "Laxmana";
        System.out.println(b1.name + ", " + b1.authors[0]);
        System.out.println(b2.name + "," + b2.authors[0]);
        System.out.println(b3.name + ", " + b3.authors[0]);
    }
}

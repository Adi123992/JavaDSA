package OPPE_Java.Quiz3;
//COPY CONSTRUCTOR QUESTION
//Input:
//Suba COA
//Output:
//Nandu: DL
//Suba: COA

import java.util.*;

class Author {
    private String name;
    private String[] books;

    //***** Define constructor(s) here
    public Author(String name, String[] books) {
        this.name = name;
        this.books = books;
    }

    public Author(Author a) {
        this.name = a.name;
        this.books = a.books.clone();
    }

    public void setBook(int indx, String b) {
        books[indx] = b;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getBook(int indx) {
        return books[indx];
    }
}

public class PublicationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] books = {"Maths", "DL", "DSA", "DC"};
        Author a1 = new Author("Nandu", books);
        Author a2 = new Author(a1);
        a2.setName(sc.next());
        a2.setBook(1, sc.next());
        System.out.println(a1.getName() + ": " + a1.getBook(1));
        System.out.println(a2.getName() + ": " + a2.getBook(1));
    }
}

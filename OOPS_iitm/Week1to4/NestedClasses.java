package OOPS_iitm.Week1to4;

class Language {
    public void show() {
        System.out.println("In Language class");
    }

    public class Programming {
        public void show() {
            System.out.println("In Programming class");
        }
    }
}

public class NestedClasses {
    public static void main(String[] args) {
        new Language().new Programming().show();
    }
}


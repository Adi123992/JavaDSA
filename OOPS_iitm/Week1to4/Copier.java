package OOPS_iitm.Week1to4;

class Scanner extends Copier {
    @Override
    public void scanDocuments() {
        System.out.println("Scanner");
    }
}

class Printer extends Copier {
    @Override
    public void printDocuments() {
        System.out.println("Printer");
    }
}

//multiple inheritance is not allowed in JAVA
//public class Copier extends Scanner, Printer
public class Copier {
    public void scanDocuments() {
        System.out.println("Copier Scanner");
    }

    public void printDocuments() {
        System.out.println("Copier Printer");
    }
}

package OOPS_iitm.Week5to8.Generics;

interface TV {
    abstract void features(String name);
}

class LedTv implements TV {
    public void features(String name) {
        System.out.println("Picture quality of " + name + " TV is good.");
    }
}

class SmartTv extends LedTv {
    public void features(String name) {
        super.features(name);
        System.out.println(name + " TV similar to LED TV with internet connection");
    }
}

public class Gen2 {
    public static void main(String[] args) {
        Gen2 obj = new Gen2();
        obj.getDetails(new LedTv(), "Led");
        obj.getDetails(new SmartTv(), "Smart"); //Line 2
    }

    public <T extends TV> void getDetails(T obj, String name) { //Line 1
        obj.features(name);
    }
}

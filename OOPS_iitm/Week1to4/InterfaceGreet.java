package OOPS_iitm.Week1to4;

interface Inter {
    public abstract void greet();
}

class Greetings {
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String s) {
        this.country = s;
    }

    public Inter checkCountry() {
        if (getCountry() == "India") {
            return new IndiaGreetings();
        }
        return new WorldGreetings();
    }

    private class IndiaGreetings implements Inter {
        public void greet() {
            System.out.println("Hello" + " " + "India");
        }
    }

    private class WorldGreetings implements Inter {
        public void greet() {
            System.out.println("Hello" + " " + "World");
        }
    }
}

public class InterfaceGreet {
    public static void main(String[] args) {
        Greetings g = new Greetings();
        g.setCountry("India");
        g.checkCountry().greet();

    }
}
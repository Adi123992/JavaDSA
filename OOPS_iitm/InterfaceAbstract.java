package OOPS_iitm;

interface Communicable {
    default void communicate() {// default method doesnt need to be overriden it is automatically present
        System.out.println("Communicating via text");
    }
}

abstract class VoiceCommunicator {
    public void communicate() {// the concrete method doesnt need to be override, it by default there after extension
        System.out.println("Communicating via voice");
    }
}

class Smartphone extends VoiceCommunicator implements Communicable { // LINE 1
}

public class InterfaceAbstract {
    public static void main(String[] args) {
        Smartphone sp = new Smartphone();
        sp.communicate(); // LINE 2
    }
}

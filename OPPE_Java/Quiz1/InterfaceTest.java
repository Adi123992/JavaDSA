package OPPE_Java.Quiz1;

//Public test case (Input):
//C Dell
//M Samsung
//C Lenovo
//Output:
//Dell computes
//Samsung is fully charged
//Lenovo computes

import java.util.ArrayList;
import java.util.Scanner;

//DEFINE interface Computer
interface Computer {

    String compute();
}

//DEFINE interface PortableDevice
interface PortableDevice {

    String batteryBalance();
}

//DEFINE class Laptop
class Laptop implements Computer, PortableDevice {
    private String name;

    public Laptop(String next) {
        name = next;
    }

    @Override
    public String compute() {
        return (name + " computes");
    }

    @Override
    public String batteryBalance() {
        return (name + " is fully charged");
    }
}

class InterfaceTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> messagesList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String type = sc.next();
            if (type.equals("C")) {
                Computer c = new Laptop(sc.next());
                messagesList.add(c.compute());
            } else if (type.equals("M")) {
                PortableDevice m = new Laptop(sc.next());
                messagesList.add(m.batteryBalance());
            }
        }
        for (String s : messagesList) {
            System.out.println(s);
        }
        sc.close();
    }
}

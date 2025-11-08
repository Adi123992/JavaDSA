package OPPE_Java.Quiz4;

//Public test case (Input):
//C Nikon
//C Sony
//C GoPro
//Output:
//Nikon takes a picture
//Sony takes a picture
//GoPro takes a picture

import java.util.*;

//DEFINE interface MobileDevice
interface MobileDevice {
    String makeCall();
}

//DEFINE interface Camera
interface Camera {
    String takePicture();
}

//DEFINE class Smartphone
class Smartphone implements MobileDevice, Camera {

    String name;

    public Smartphone(String n) {
        name = n;
    }

    @Override
    public String takePicture() {
        return name + " takes a picture";
    }

    @Override
    public String makeCall() {
        return name + " makes a call";
    }
}

class InterfaceTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> messagesList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String type = sc.next();
            if (type.equals("M")) {
                MobileDevice m = new Smartphone(sc.next());
                messagesList.add(m.makeCall());
            } else if (type.equals("C")) {
                Camera c = new Smartphone(sc.next());
                messagesList.add(c.takePicture());


            }
        }
        for (String s : messagesList) {
            System.out.println(s);
        }
        sc.close();
    }
}

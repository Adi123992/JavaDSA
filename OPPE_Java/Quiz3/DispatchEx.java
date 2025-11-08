package OPPE_Java.Quiz3;

//DYNAMIC METHOD DISPATCH QUESTION
//Public test case  (Input):
//River Ganga
//Lake Dal
//Output:
//Inside an anonymous body of water
//Inside river River Ganga
//Inside lake Lake Dal

import java.util.*;

class WaterBody {
    private String name;

    public WaterBody(String n) {
        name = n;
    }

    // Define method display
    public void display() {
        System.out.println("Inside an anonymous body of water");
    }

    // Define an accessor method
    public String getName() {
        return name;
    }
}

// Define class River
class River extends WaterBody {
    public River(String r) {
        super(r);
    }

    public void display() {
        System.out.println("Inside river " + getName());
    }
}

// Define class Lake
class Lake extends WaterBody {
    public Lake(String n) {
        super(n);
    }

    public void display() {
        System.out.println("Inside lake " + getName());
    }
}

public class DispatchEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WaterBody[] wBodies = new WaterBody[3];
        wBodies[0] = new WaterBody("");
        wBodies[1] = new River(sc.nextLine());
        wBodies[2] = new Lake(sc.nextLine());
        wBodies[0].display();
        wBodies[1].display();
        wBodies[2].display();
        sc.close();
    }
}



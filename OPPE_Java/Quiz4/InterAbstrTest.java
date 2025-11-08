package OPPE_Java.Quiz4;

//Input 1:
//Python
//Java
//Output 1:
//TA studies Python
//TA studies Java
//TA teaches Java

import java.util.Scanner;

interface IResearchScholar {
    public void teaches(String str);

    public void studies(String s);
}

class JuniorRS implements IResearchScholar {

    @Override
    public void teaches(String str) {

    }

    @Override
    public void studies(String s) {
        System.out.println("TA studies " + s);
    }
}

class SeniorRS extends JuniorRS {
    @Override
    public void teaches(String str) {
        System.out.println("TA teaches " + str);
    }

    @Override
    public void studies(String s) {
        System.out.println("TA studies " + s);
    }
}

public class InterAbstrTest extends SeniorRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        JuniorRS jrs = new InterAbstrTest();
        SeniorRS srs = new InterAbstrTest();
        jrs.studies(str1);
        srs.studies(str2);
        srs.teaches(str2);
        sc.close();
    }
}

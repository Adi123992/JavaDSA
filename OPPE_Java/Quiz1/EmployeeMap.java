package OPPE_Java.Quiz1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class Company {
    private Map<String, ArrayList<Integer>> employeeMap;

    public Company(Map<String, ArrayList<Integer>> e) {
        employeeMap = e;
    }

    public Map<String, ArrayList<Integer>> getEmployeeMap() {
        return employeeMap;
    }
}

public class EmployeeMap {
    public static ArrayList<String> getFinalList(Company c) {
        ArrayList<String> eList = new ArrayList<String>();
        for (Map.Entry<String, ArrayList<Integer>> entry :
                c.getEmployeeMap().entrySet()) {
            ArrayList<Integer> targetList = entry.getValue();
            int i = 0;
            while (i < targetList.size() && targetList.get(i) >= 10) {
                i++;
            }
            if (i == targetList.size()) {
                eList.add(entry.getKey());
            }
        }
        return eList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, ArrayList<Integer>> emap =
                new LinkedHashMap<String, ArrayList<Integer>>();
        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> targetList = new ArrayList<Integer>();
            String name = sc.next();
            for (int j = 0; j < 3; j++) {
                targetList.add(sc.nextInt());
            }
            emap.put(name, targetList);
        }
        Company c = new Company(emap);
        System.out.println(getFinalList(c));
    }
}

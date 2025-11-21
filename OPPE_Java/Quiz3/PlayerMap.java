package OPPE_Java.Quiz3;

import java.util.ArrayList;
import java.util.Map;
import java.util.*;

//THIS IS THE MAP QUESTION
//Public test case (Input):
//Ravi 76 76 76
//sonu 80 80 89
//viral 98 47 99
//Output:
//[sonu]
class Team {
    private Map<String, ArrayList<Integer>> playerMap;

    public Team(Map<String, ArrayList<Integer>> m) {
        playerMap = m;
    }

    public Map<String, ArrayList<Integer>> getPlayerMap() {
        return playerMap;
    }
}

public class PlayerMap {
    public static ArrayList<String> getFinalList(Team t) {
// Define the method getFinalList( ) here
        ArrayList<String> finalList = new ArrayList<>();
        Map<String, ArrayList<Integer>> p = t.getPlayerMap();
        for (Map.Entry<String, ArrayList<Integer>> entry : p.entrySet()) {
            ArrayList<Integer> pass = entry.getValue();
            int i = 0;
            while (i < pass.size() && pass.get(i) >= 80) {
                i++;
            }
            if (i == pass.size()) {
                finalList.add(entry.getKey());
            }
        }

        return finalList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, ArrayList<Integer>> pmap = new LinkedHashMap<String, ArrayList<Integer>>();

        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> pruns = new ArrayList<Integer>();
            String name = sc.next();
            for (int j = 0; j < 3; j++) {
                pruns.add(sc.nextInt());
            }
            pmap.put(name, pruns);
        }
        Team t = new Team(pmap);
        System.out.println(getFinalList(t));
    }
}

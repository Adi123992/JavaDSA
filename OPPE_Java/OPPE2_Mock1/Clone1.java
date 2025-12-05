package OPPE_Java.OPPE2_Mock1;

//Input:
//UltraMegaTeam
//MegaManager
//MegaManager
//500000
//Output:
//Team t1: Alpha
//Project: AI Development, budget: 100000.0
//Manager: Madhu
//Team t2: UltraMegaTeam
//Project: MegaManager, budget: 500000.0
//Manager: MegaManager

import java.util.*;

class Project implements Cloneable {
    private String proj_name;
    private double budget;

    public Project(String nm, double b) {
        proj_name = nm;
        budget = b;
    }

    public void setProjectName(String nm) {
        proj_name = nm;
    }

    public String toString() {
        return "Project: " + proj_name + ", budget: " + budget;
    }

    // Write code to implement clone() method
    public Project clone() throws CloneNotSupportedException {
        return (Project) super.clone();
    }
}

class Manager implements Cloneable {
    private String mngr_name;
    private Project proj;

    public Manager(String mn, Project p) {
        mngr_name = mn;
        proj = p;
    }

    public String toString() {
        return proj + "\n" + "Manager: " + mngr_name;
    }

    // Write code to implement clone() method
    @Override
    public Manager clone() throws CloneNotSupportedException {
        Manager m = (Manager) super.clone();
        m.proj = this.proj.clone();
        return m;
    }
}

class Team implements Cloneable {
    private String teamName;
    private Manager mngr;

    public Team(String tn, Manager m) {
        teamName = tn;
        mngr = m;
    }

    public void setTeamName(String tn) {
        teamName = tn;
    }

    public void setManager(Manager m) {
        mngr = m;
    }

    public String toString() {
        return teamName + "\n" + mngr;
    }

    // Write code to implement clone() method
    public Team clone() throws CloneNotSupportedException {
        Team t = (Team) super.clone();
        t.mngr = this.mngr.clone();
        return t;
    }
}

public class Clone1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        Project p1 = new Project("AI Development", 100000);
        Manager m1 = new Manager("Madhu", p1);
        Team t1 = new Team("Alpha", m1);
        Team t2 = t1.clone();
        t2.setTeamName(sc.nextLine());
        t2.setManager(new Manager(sc.nextLine(),

                new Project(sc.nextLine(), sc.nextDouble())));

        System.out.println("Team t1: " + t1);
        System.out.println("Team t2: " + t2);
        sc.close();
    }
}
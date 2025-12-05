package OPPE_Java.OPPE2_Mock2;

//Input:
//Website-Redesign 1 Elena
//Machine-Learning-Project 0
//Data-Analysis 0
//Output:
//Exception caught: null
//Updated Project List:
//Project: Website-Redesign, Team Members: [Elena]
//Project: Machine-Learning-Project, Team Members: [Default Member]
//Project: Data-Analysis, Team Members: [Default Member]

import java.util.*;

// define class NoTeamMemberException
class NoTeamMemberException extends Exception {
    public NoTeamMemberException() {
        super();
    }
}

class Project {
    private String projectName;
    private List<String> teamMembers;

    public Project(String pN) {
        projectName = pN;
        this.teamMembers = new ArrayList<>();
    }

    public void addTeamMember(String memberName) {
        teamMembers.add(memberName);
    }

    public String toString() {
        return "Project: " + projectName + ", Team Members: " + teamMembers;
    }

    public boolean hasTeamMembers() throws NoTeamMemberException {
        if (teamMembers.size() > 0) {
            return true;
        } else {
            throw new NoTeamMemberException();
        }
    }
}

public class Exception2 {
    // define method updateProjectList
    public static void updateProjectList(List<Project> projectList) {
        for (Project p : projectList) {
            try {
                p.hasTeamMembers();
            } catch (NoTeamMemberException e) {
                p.addTeamMember("Default Member");
            }
        }
    }

    public static void displayProjectList(List<Project> projectList) {
        System.out.println("Updated Project List:");
        for (Project project : projectList) {
            System.out.println(project);
        }
    }

    public static void main(String[] args) throws NoTeamMemberException {
        Scanner sc = new Scanner(System.in);
        List<Project> projectList = new ArrayList<Project>();
        for (int i = 0; i < 3; i++) {
            String projectName = sc.next();
            Project project = new Project(projectName);
            projectList.add(project);
            int numTeamMembers = sc.nextInt();
            for (int j = 0; j < numTeamMembers; j++) {
                String memberName = sc.next();
                project.addTeamMember(memberName);
            }
        }
        try {
            for (Project project : projectList) {
                project.hasTeamMembers();
            }
        } catch (NoTeamMemberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        updateProjectList(projectList);
        displayProjectList(projectList);
        sc.close();
    }

}
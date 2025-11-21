package OOPS_iitm.Week1to4;

class Student {
    public String sname;
    public String sid;
    public int sclass;

    public Student(String s_name, String s_id, int s_class) {
        this.sname = s_name;
        this.sid = s_id;
        this.sclass = s_class;
    }

    public Student() {

    }

    public void display() {
        System.out.println("name:" + sname);
        System.out.println("id:" + sid);
        System.out.println("class:" + sclass);
    }
}

class Toppers extends Student {
    public int marks;

    public Toppers(int marks) {
        //if we are inheriting from parent class then super() becomes mandatory
        //as it calls the no args constructor of the parent class and sets the values to default
        //if you want to specify the other parameterized constructor of parent class then add the parameter
        //of that constructor to the super function as well
        super();//this was added later
        this.marks = marks;
    }

    public void display() {
        super.display();
        System.out.println("marks:" + marks);
    }
}

public class FClass3 {
    public static void main(String[] args) {
        Toppers t = new Toppers(30);
        t.display();
    }
}

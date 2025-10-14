package OOPS_iitm;


class Person {
    private String name;
    private int age;

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public boolean equals(Object obj) {
        //code block
        if (obj instanceof Person) {
            Person p = (Person) obj;
            if (name.equals(p.name) && age == p.age)
                return true;
        }
        return false;

    }
}

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("John", 30);
        Person p2 = new Person("John", 30);
        if (p1.equals(p2))
            System.out.println("p1, p2 are same");
        else
            System.out.println("p1, p2 are different");
    }
}
//code block options:
//1
//if(obj instanceof Person) {
//       if(name == obj.name && age == obj.age)
//              return true;
//}
//return false;
//2
//if(name == obj.name && age == obj.age)
//       return true;
//return false;
//3
//if(obj instanceof Person) {
//       Person p = obj;
//       if(name.equals(p.name) && age == p.age)
//            return true;
//}
//return false;
//4
//if(obj instanceof Person) {
//        Person p = (Person) obj;
//        if(name.equals(p.name) && age == p.age)
//            return true;
//}
//return false;
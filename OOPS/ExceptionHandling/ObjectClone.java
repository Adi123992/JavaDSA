package OOPS.ExceptionHandling;

public class ObjectClone implements Cloneable {
    int age;
    String name;
    int[] arr;

    public ObjectClone(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{1, 2, 3, 4, 5};
    }

    public ObjectClone(ObjectClone other) {
        this.age = other.age;
        this.name = other.name;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ObjectClone o = new ObjectClone(36, "Aditya");
        ObjectClone other = new ObjectClone(o);
        System.out.println(other.age + " : " + other.name);
        //it creates a copy i.e. a clone of Class object via clone method in Clonable which may throw an exception when not mentioned in class definition
        ObjectClone clone = (ObjectClone) other.clone();
        System.out.println(clone.age + " : " + clone.name);


    }

//    public Object clone() throws CloneNotSupportedException {
//        //this is a shallow copy
//        return super.clone();
//    }

    public Object clone() throws CloneNotSupportedException {
        //this is a deep copy
        ObjectClone other = (ObjectClone) super.clone();//actually a shallow copy
        other.arr = new int[this.arr.length];
        for (int i = 0; i < this.arr.length; i++) {
            other.arr[i] = this.arr[i];
        }
        return other;

    }
}

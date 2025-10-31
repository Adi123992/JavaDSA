package OOPS.Generics;

public class GenericDemo {
    Object value;

    public GenericDemo(Object value) {
        this.value = value;
    }

    public static void main(String[] args) {
        GenericDemo g = new GenericDemo(4);
        int x = (Integer) g.getValue();//since the object is the super class of all the other subclasses so the integer and all other numbers fall under object class hence we cannot cast direct object types to lower cast variables hence we need to type cast them
        //if the input was of time Object then we didnt even need to type cast them they already fall under Object type
        System.out.println(x);
    }

    public Object getValue() {
        return value;
    }
}

package OOPS_iitm.Week1to4;


class University {
    public int univ_id;

    //to acutally print you can use this
//    public void getReference() {
//        College c = new College("IITMadras");
//        c.getName();
//    }
    public College getReference() {
        return new College("IITMadras");
    }

    //As the class is private so we are using a public method
    //to return an object of the inner class

    private class College {
        private String college_name;

        public College(String name) {
            college_name = name;
        }

        public void getName() {
            System.out.println(college_name);
        }
    }
}

public class NestedClassUniversity {
    public static void main(String[] args) {
        University uni = new University();
        uni.getReference();// to print this u need to create an object of college but since college is a private class you cannot access it outside the outer class so you cannot either create the object of the class as well.
        //(uni.getReference()).getName();
    }
}

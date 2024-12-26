public class OOPS2 {
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student("Laddu Singh");
        Student s3 = new Student(123);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

}

class Student {
    String name;
    int roll;

    Student() {
        System.out.println("Constructor is called....");
    }

    Student(String name) {
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }

    @Override // overriding
    public String toString() {
        return "Student{name='" + name + "', roll=" + roll + "}";
    }

}

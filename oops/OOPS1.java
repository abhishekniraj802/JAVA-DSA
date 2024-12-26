public class OOPS1 {
    public static void main(String args[]) {
        // Student s1 = new Student("Laddu Singh");
        Student s1 = new Student();
        System.out.println(s1.name);
    }
}

// constructor and constructor called
class Student {
    String name;
    int roll;

    // Student(String name) {
    Student() {
        // this.name = name;

        System.out.println("constructor is called......");
    }
}

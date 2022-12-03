class Student {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }
    Student() {

    }
    public void printDetails() {
        System.out.println("The name of the student is: " + this.name);
        System.out.println("The age is: " + this.age);
    }
}
public class Main {
    public static void main(String args[]) {
        Student s1 = new Student("Shivam", 23);
        s1.printDetails();
        Student s2 = new Student(s1);
        s2.printDetails();
    } 
}

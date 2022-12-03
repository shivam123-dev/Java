// class Pen{
//     String color;
//     String type;
//     public void write() {
//         System.out.println("Writing something");
//     }
//     public void printColor() {
//         System.out.println(this.color);
//     }
//     public void printType() {
//         System.out.println(this.type);
//     }
// }

class Student {
    String name;
    int age;
    String collegeName;
    float CGPA;

    public void printDetails() {
        System.out.println("Name of the student: " + this.name);
        System.out.println("Age of the student: " + this.age);
        System.out.println("Name of the college of the student: " + this.collegeName);
        System.out.println("CGPA of the student: " + CGPA);
    }
}

public class oops {
    public static void main(String args[]) {
        // Pen pen1 = new Pen();
        // pen1.color = "red";
        // pen1.type = "ballpoint";
        // Pen pen2 = new Pen();
        // pen2.color = "black";
        // pen2.type = "gel";
        // pen1.printColor();
        // pen1.printType();
        // pen2.printColor();
        // pen2.printType();

        Student s1 = new Student();
        s1.name = "Ram";
        s1.age = 20;
        s1.collegeName = "SRM";
        s1.CGPA = 9.25f;
        s1.printDetails();

    }
}

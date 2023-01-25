public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Mateusz Meges";
        student1.studentNumber = 29358;

        Student student2 = new Student();
        student2.name = "default name";
        student2.studentNumber = 12345;

        System.out.println("Student 1: " + student1.name + " " + student1.studentNumber);
        System.out.println("Student 2: " + student2.name + " " + student2.studentNumber);

        SecretStudent student = new SecretStudent();
        System.out.println("Standard name: " + student.getName());
        System.out.println("Standard surname: " + student.getSurname());
        System.out.println("Standard student number: " + student.getStudentNumber());

        SecretStudent student11 = new SecretStudent();
        SecretStudent student22 = new SecretStudent();
        student11.readFromScanner();
        student22.readFromScanner();
        System.out.println("\nStudent 1:");
        student11.print();
        System.out.println("\nStudent 2:");
        student22.print();
    }
}
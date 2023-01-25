import java.util.Scanner;

class SecretStudent {
    private String name = "John Doe";
    private String surname = "Doe";
    private int studentNumber = 54321;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if (newName != null && !newName.isEmpty()) {
            name = newName;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String newSurname) {
        if (newSurname != null && !newSurname.isEmpty()) {
            surname = newSurname;
        }
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int newStudentNumber) {
        studentNumber = newStudentNumber;
    }

    public void readFromScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        setName(scanner.nextLine());
        System.out.print("Enter surname: ");
        setSurname(scanner.nextLine());
        System.out.print("Enter student number: ");
        setStudentNumber(scanner.nextInt());
    }

    public void print() {
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurname());
        System.out.println("Student number: " + getStudentNumber());
    }
}
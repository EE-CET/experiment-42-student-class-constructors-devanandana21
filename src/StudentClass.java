import java.util.Scanner;

public class StudentClass {

    String name;
    int rollNo;

    // Parameterized constructor
    StudentClass(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display(int studentNumber) {
        System.out.println("Student " + studentNumber + " details: Name: " + name + " Roll: " + rollNo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Student 1 input
        String name1 = sc.nextLine();
        int roll1 = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        // Student 2 input
        String name2 = sc.nextLine();
        int roll2 = sc.nextInt();

        // Object creation
        StudentClass s1 = new StudentClass(name1, roll1);
        StudentClass s2 = new StudentClass(name2, roll2);

        // Output
        s1.display(1);
        s2.display(2);

        sc.close();
    }
}

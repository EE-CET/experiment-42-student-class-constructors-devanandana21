import java.util.Scanner;

public class StudentClass {

    String name;
    int rollNo;

    StudentClass(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Name: " + name + " Roll: " + rollNo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name1 = sc.nextLine();
        int roll1 = sc.nextInt();
        sc.nextLine(); 

        String name2 = sc.nextLine();
        int roll2 = sc.nextInt();

        StudentClass s1 = new StudentClass(name1, roll1);
        StudentClass s2 = new StudentClass(name2, roll2);

    
        s1.display();
        s2.display();

        sc.close();
    }
}

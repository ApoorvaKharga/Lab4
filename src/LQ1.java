import java.util.Scanner;

abstract class Student {
    int rollNo;
    long regNo;

    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rollno: ");
        rollNo = sc.nextInt();
        System.out.print("Enter Registration no: ");
        regNo = sc.nextLong();
    }

    abstract void course();
}

class Kiitian extends Student {

    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }

    void display() {
        System.out.println("Rollno - " + rollNo);
        System.out.println("Registration no - " + regNo);
        course();
    }
}

public class LQ1 {
    public static void main(String[] args) {
        Kiitian k = new Kiitian();
        k.getInput();
        k.display();
    }
}


import java.util.Scanner;

interface Salary {
    double earnings();
    double deductions();
    double bonus();
}

abstract class Manager implements Salary {
    double basic;

    Manager(double basic) {
        this.basic = basic;
    }

    public double earnings() {
        return basic + (0.80 * basic) + (0.15 * basic);
    }

    public double deductions() {
        return 0.12 * basic;
    }
}

class Substaff extends Manager {

    Substaff(double basic) {
        super(basic);
    }

    public double bonus() {
        return 0.50 * basic;
    }
}

public class LQ3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic salary: ");
        double basic = sc.nextDouble();

        Substaff s = new Substaff(basic);

        System.out.println("Earnings - " + s.earnings());
        System.out.println("Deduction - " + s.deductions());
        System.out.println("Bonus - " + s.bonus());
    }
}


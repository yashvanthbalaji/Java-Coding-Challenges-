package InheritanceTypes;

class Parents {
    int mom_salary = 20000;
    int dad_salary = 40000;
    int savings = 50000;

    void familySalary() {
        System.out.println("Both parents total salary = " + (mom_salary + dad_salary));
        System.out.println("Total amount they have = " + (mom_salary + dad_salary + savings));
    }
}

class Children extends Parents {
    int scholarship_amt = 2000;
    int pocket_money = 500;
}

public class SingleInheritance {
    public static void main(String[] args) {
        Children ram = new Children();

        System.out.println("Dad Salary: " + ram.dad_salary);
        System.out.println("Mom Salary: " + ram.mom_salary);
        System.out.println("Savings: " + ram.savings);

        ram.familySalary();

        System.out.println("Scholarship Amount: " + ram.scholarship_amt);
        System.out.println("Pocket Money: " + ram.pocket_money);
    }
}

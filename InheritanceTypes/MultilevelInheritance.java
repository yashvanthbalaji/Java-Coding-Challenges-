package InheritanceTypes;

// Base class
class Family {
    int family_savings = 100000;
}

// Level 1 inheritance
class Dad extends Family {
    int dad_salary = 30000;
    int dad_savings = 15000;
}

// Level 2 inheritance
class Mom extends Dad {
    int mom_salary = 25000;
    int mom_savings = 13000;
}

// Level 3 inheritance (final level)
class Child extends Mom {
    int child_scholarship = 2000;
    int child_pocket_money = 500;
    int child_savings = 0;

    Child(String name, int age) {
        System.out.println("Child name: " + name);
        System.out.println("Child age: " + age);
    }
}

// Main or Driver class
public class MultilevelInheritance {
    public static void main(String[] args) {
        String name = "Shiva";
        int age = 19;

        Child obj1 = new Child(name, age);

        System.out.println("Family savings: " + obj1.family_savings);
        System.out.println("Dad savings: " + obj1.dad_savings);
        System.out.println("Mom salary: " + obj1.mom_salary);
        System.out.println("Child scholarship: " + obj1.child_scholarship);

        System.out.println("Code executed successfully!");
    }
}

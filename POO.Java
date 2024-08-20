class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculateSalary() {
        return salary;
    }

    public void display() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

class FullTimeEmployee extends Employee {
    FullTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateSalary() {
        return salary; // Example: Full-time salary
    }
}

class PartTimeEmployee extends Employee {
    PartTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateSalary() {
        return salary; // Example: Part-time salary
    }
}

public class Main {
    public static void main(String[] args) {
        Employee ftEmployee = new FullTimeEmployee("John Doe", 60000);
        Employee ptEmployee = new PartTimeEmployee("Jane Smith", 20000);

        ftEmployee.display();
        ptEmployee.display();
    }
}

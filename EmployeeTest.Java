
package employee;

abstract class Employee {
    protected String name;
    
    public Employee (String name)
    {
        this.name = name;
    }
    
    public abstract double calculateSalary();
    
        public String getName()
        {
            return name;
        }
}
        class FullTimeEmployee extends Employee 
        {
            private double monthlySalary;
            
            public FullTimeEmployee (String name, double monthlySalary)
            {
                super(name);
                this.monthlySalary = monthlySalary;
            }
            
            @Override
            public double calculateSalary() 
            {
                return monthlySalary;
            }
        }
        
        class PartTimeEmployee extends Employee 
        {
            private double hourlyRate;
            private int hoursWorked;
            
            public PartTimeEmployee (String name, double hourlyRate, int hoursWorked)
            {
                super(name);
                this.hourlyRate = hourlyRate;
                this.hoursWorked = hoursWorked;
            }
            
             @Override
            public double calculateSalary() 
            {
                return hourlyRate * hoursWorked;
            }
        }
        
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("George", 3000.00);
        Employee emp2 = new PartTimeEmployee("Bob", 20.00, 80);
        
        System.out.println(emp1.getName() + "'s Salary: $ " + emp1.calculateSalary());
        System.out.println(emp2.getName() + "'s Salary: $ " + emp2.calculateSalary());
    }
    
}

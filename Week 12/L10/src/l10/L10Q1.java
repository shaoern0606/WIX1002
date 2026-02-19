package l10;

abstract class Employee{
    private String name;
    
    public abstract double computeSalary();
    public abstract String getEmployeeType();
    
    public Employee(String name) {
        this.name = name;
    };
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Employee Type: " + getEmployeeType());
        System.out.printf("Total Salary Per Month: RM%.2f%n%n", computeSalary());
    }
}

class PermanentEmployee extends Employee {
    private char category;
    
    public PermanentEmployee(String name, char category) {
        super(name);
        this.category = category;
    }
    
    public String getEmployeeType() {
        return "Permanent Employee";
    }
    
    public double computeSalary() {
        return switch (category) {
            case 'A' -> 4000;
            case 'B' -> 3000;
            case 'C' -> 2000;
            default -> 0;
        };
    };
}

class ContractStaff extends Employee {
    private double totalSales;
    
    public ContractStaff(String name, double totalSales) {
        super(name);
        this.totalSales = totalSales;
    }
    
    public String getEmployeeType() {
        return "Contract Staff";
    }
    
    public double computeSalary() {
        return 500 + 0.5 * totalSales;
    };
}

class TemporaryStaff extends Employee {
    private int hour;
    
    public TemporaryStaff(String name, int hour) {
        super(name);
        this.hour = hour;
    }
    
    public String getEmployeeType() {
        return "Temporary Staff";
    }
    
    public double computeSalary() {
        return 15 * hour;
    };
}


public class L10Q1 {
    public static void main(String[] args) {
        Employee e1 = new PermanentEmployee("Alice", 'A');
        Employee e2 = new ContractStaff("Bob", 3000);
        Employee e3 = new TemporaryStaff("Charlie", 120);

        e1.display();
        e2.display();
        e3.display();
    }
}

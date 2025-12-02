class Employee {
    int empno;
    String name;
    float sal;
    
    // Parameterized Constructor
    Employee(int empno, String name, float sal) {
        this.empno = empno;   // 'this' refers to current object's variable
        this.name = name;
        this.sal = sal;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println(empno + " | " + name + " | " + sal);
    }
} 

class Main {
    public static void main(String[] args) {
        // Creating employees with different values
        Employee emp1 = new Employee(101, "Aashish", 5000f);
        Employee emp2 = new Employee(102, "Priya", 6000f);
        Employee emp3 = new Employee(103, "Rahul", 7000f);

        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}

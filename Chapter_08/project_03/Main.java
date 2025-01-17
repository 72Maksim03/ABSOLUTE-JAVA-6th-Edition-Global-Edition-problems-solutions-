/**
 * Extend the previous problem to calculate the salary deductions based on the
 * number of days an employee is on leave. Consider 20 working days per month. Add
 * a method that calculates the deductions of each employee based on their leave
 * Extend the previous problem to calculate the salary deductions based on the number
 * of days an employee is on leave. Consider 20 working days per month. Add
 * a method that calculates the deductions of each employee based on their leave
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("E101", "John Doe", "IT", 50000.00, "Software Engineer", 2);
        Employee employee2 = new Employee("E102", "Jane Smith", "HR", 60000.00, "HR Manager", 7);

        Manager manager1 = new Manager("M101", "Manager1", "IT", 20000, 2);
        Manager manager2 = new Manager("M102", "Manager2", "HR", 25000, 0);

        Clerk clerk1 = new Clerk("C101", "Clerk1", "IT", 15000, 7);
        Clerk clerk2 = new Clerk("C102", "Clerk2", "HR", 15000, 1);

        Employee[] employees = {employee1, employee2, manager1, manager2, clerk1, clerk2};

        double totalDed = 0.0;
        for (int i = 0; i < employees.length; i++) totalDed += employees[i].deductions();

        System.out.println("Total deductions: " + totalDed);
    }
}

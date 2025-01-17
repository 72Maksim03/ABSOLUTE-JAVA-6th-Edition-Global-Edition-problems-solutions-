/**
 * Create a class named Employee that can be used to calculate the salaries of different
 * employees. The Employee class should keep a track of the employee ID, name, department,
 * salary, and designation with appropriate accessor and mutator methods.
 * Also create an equals() method that overrides Object’s equals() method,
 * where employees can check if their designation is identical. Next, create two additional
 * classes named Manager and Clerk that are derived from Employee. Create an
 * overridden method named addBonus that returns the salary of the employee after
 * adding up the bonus. There is a default bonus of $200/month. Managers have a
 * bonus of $300/month and clerks have a bonus of $100/month. Finally create a display
 * method to print the details of the employee. You may assume the initial salary
 * of an employee and other necessary values. Test your classes from a main method.
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("E101", "John Doe", "IT", 50000.00, "Software Engineer");
        Employee employee2 = new Employee("E102", "Jane Smith", "HR", 60000.00, "HR Manager");

        System.out.println("Employee 1 Details:");
        System.out.println(employee1);

        System.out.println("\nEmployee 2 Details:");
        System.out.println(employee2);

        System.out.println("Are employee 1 and employee 2 equal? " + employee1.equals(employee2));

        Manager manager1 = new Manager("M101", "Manager1", "IT", 20000);
        Manager manager2 = new Manager("M102", "Manager2", "HR", 25000);
        System.out.println("\nManager 1 Details:");
        System.out.println(manager1);

        System.out.println("\nManager 2 Details:");
        System.out.println(manager2);

        System.out.println("Are manager 1 and manager 2 equal? " + manager1.equals(manager2));

        System.out.println("\nManager 1 bonus: " + manager1.getBonus());

        Clerk clerk1 = new Clerk("C101", "Clerk1", "IT", 15000);
        Clerk clerk2 = new Clerk("C102", "Clerk2", "HR", 15000);

        System.out.println("\nClerk 1 Details:");
        System.out.println(clerk1);

        System.out.println("\nClerk 2 Details:");
        System.out.println(clerk2);

        System.out.println("Are clerk 1 and clerk 2 equal? " + clerk1.equals(clerk2));

        System.out.println("\nClerk 1 bonus: " + clerk1.getBonus());

    }
}

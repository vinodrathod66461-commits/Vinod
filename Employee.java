package vinod;

	import java.util.Scanner;

	public class Employee {

	    String name;
	    int age;
	    String designation;
	    double salary;

	    // Create Employee
	    void create(Scanner sc) {

	        System.out.print("Enter the name: ");
	        name = sc.nextLine();

	        System.out.print("Enter the age: ");
	        age = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Enter the Designation (P/M/T): ");
	        designation = sc.nextLine();

	        if (designation.equalsIgnoreCase("P"))
	            salary = 20000;

	        else if (designation.equalsIgnoreCase("M"))
	            salary = 30000;

	        else if (designation.equalsIgnoreCase("T"))
	            salary = 25000;

	        else
	            salary = 0;

	        // Confirmation
	        System.out.print("Do you want to create this employee? (y/n): ");
	        char ch = sc.next().charAt(0);
	        sc.nextLine();

	        if (ch == 'y' || ch == 'Y') {
	            System.out.println("Employee created successfully!");
	        } 
	        else {
	            System.out.println("Employee creation cancelled.");

	            name = null;
	            age = 0;
	            designation = null;
	            salary = 0;
	        }
	    }

	    // Display Employee
	    void display() {

	        if (name == null) {
	            System.out.println("No employee created.");
	            return;
	        }

	        System.out.println("\nYour name is: " + name);
	        System.out.println("Your age is: " + age);
	        System.out.println("Your salary is: " + salary);
	        System.out.println("Your designation is: " + designation);
	    }

	    // Raise Salary
	    void raiseSalary(Scanner sc) {

	        if (name == null) {
	            System.out.println("No employee created.");
	            return;
	        }

	        System.out.print("Do you want to raise salary? (y/n): ");
	        char ch = sc.next().charAt(0);

	        if (ch == 'y' || ch == 'Y') {

	            salary = salary + (salary * 0.10);

	            System.out.println("Salary raised by 10%.");
	            System.out.println("New salary: " + salary);
	        }
	    }

	    // Main method
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        Employee e = new Employee();

	        int choice;

	        do {

	            System.out.println("\n1) Create");
	            System.out.println("2) Display");
	            System.out.println("3) Raise Salary");
	            System.out.println("4) Exit");

	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();
	            sc.nextLine();

	            switch (choice) {

	                case 1:
	                    e.create(sc);
	                    break;

	                case 2:
	                    e.display();
	                    break;

	                case 3:
	                    e.raiseSalary(sc);
	                    break;

	                case 4:
	                    System.out.println("Thank you!");
	                    break;

	                default:
	                    System.out.println("Invalid choice!");
	            }

	        } while (choice != 4);

	        sc.close();
	    }
	}



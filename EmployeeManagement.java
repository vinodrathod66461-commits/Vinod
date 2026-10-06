package vinod;

import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "";
        int age = 0;
        double salary = 0;
        boolean created = false;
        int choice;

        do {
            System.out.println("\n1) Create");
            System.out.println("2) Display");
            System.out.println("3) Raise salary");
            System.out.println("4) Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter your name: ");
                    name = sc.nextLine();

                    System.out.print("Enter your age: ");
                    age = sc.nextInt();

                    System.out.print("Enter your salary: ");
                    salary = sc.nextDouble();

                    created = true;
                    break;

                case 2:
                    if (created) {
                        System.out.println("Name: " + name);
                        System.out.println("Age: " + age);
                        System.out.println("Salary: " + salary);
                    } else {
                        System.out.println("Create an employee first.");
                    }
                    break;

                case 3:
                    if (created) {
                        System.out.print("Raise salary? (y/n): ");
                        char answer = sc.next().charAt(0);

                        if (answer == 'y' || answer == 'Y') {
                            System.out.print("Enter raise amount: ");
                            salary += sc.nextDouble();
                            System.out.println("New salary: " + salary);
                        }
                    } else {
                        System.out.println("Create an employee first.");
                    }
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        sc.close();
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    private static void addStudent(){
        System.out.println("Enter a Student ID:");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter a Student NAME:");
        String name = scanner.nextLine();

        System.out.println("Enter a Student MARKS:");
        double marks = scanner.nextDouble();

        students.add(new Student(id,name,marks));
        System.out.println("Student added successfully.\n");
    }
    private static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.\n");
            return;
        }
        System.out.println("Student Records:");
        for (Student s : students) {
            System.out.println(s.toString());
        }
        System.out.println();
    }

    private static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        boolean found = false;
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.print("Enter new name: ");
                String newName = scanner.nextLine();

                System.out.print("Enter new marks: ");
                double newMarks = scanner.nextDouble();

                s.setName(newName);
                s.setMarks(newMarks);

                System.out.println("Student updated successfully.\n");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.\n");
        }
    }

    private static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = scanner.nextInt();

        boolean removed = students.removeIf(s -> s.getId() == id);

        if (removed) {
            System.out.println("Student deleted successfully.\n");
        } else {
            System.out.println("Student not found.\n");
        }
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("===== Student Record Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.\n");
            }
        } while (choice != 5);
    }
}

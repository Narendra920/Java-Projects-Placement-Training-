import java.util.LinkedList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;
    String course;

    Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name +
                ", Age: " + age + ", Course: " + course);
    }
}

public class StudentManagementSystem {
    static LinkedList<Student> studentList = new LinkedList<>();

    static void addStudent(Student s) {
        studentList.add(s);
        System.out.println("Student added successfully!");
    }

    static void deleteStudent(int id) {
        for (Student s : studentList) {
            if (s.id == id) {
                studentList.remove(s);
                System.out.println("Student removed successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    static void searchStudent(int id) {
        for (Student s : studentList) {
            if (s.id == id) {
                System.out.println("Student Found:");
                s.display();
                return;
            }
        }
        System.out.println("Student not found!");
    }

    static void displayAll() {
        if (studentList.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        for (Student s : studentList) {
            s.display();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    addStudent(new Student(id, name, age, course));
                    break;

                case 2:
                    System.out.print("Enter ID to delete: ");
                    deleteStudent(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    searchStudent(sc.nextInt());
                    break;

                case 4:
                    displayAll();
                    break;

                case 5:
                    System.out.println("Exiting...");
					 System.out.println("Bye...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
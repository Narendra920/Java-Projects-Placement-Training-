import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n1.Add 2.View 3.Exit");
            int ch = sc.nextInt();

            switch(ch) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    list.add(new Student(id, name));
                    break;

                case 2:
                    for(Student s : list) {
                        System.out.println(s.id + " " + s.name);
                    }
                    break;

                case 3:
                    System.exit(0);
            }
        }
    }
}
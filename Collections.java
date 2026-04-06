import java.util.*;

class ContactBook {
    public static void main(String[] args) {
        HashMap<String, String> contacts = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("1.Add 2.View 3.Search 4.Exit");
            int ch = sc.nextInt();

            switch(ch) {
                case 1:
                    System.out.print("Name: ");
                    String name = sc.next();
                    System.out.print("Phone: ");
                    String phone = sc.next();
                    contacts.put(name, phone);
                    break;

                case 2:
                    System.out.println(contacts);
                    break;

                case 3:
                    System.out.print("Enter name: ");
                    String key = sc.next();
                    System.out.println("Phone: " + contacts.get(key));
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
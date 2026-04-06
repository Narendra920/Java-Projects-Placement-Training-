import java.util.*;

class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        boolean hasUpper = false, hasDigit = false;

        for(char c : pass.toCharArray()) {
            if(Character.isUpperCase(c)) hasUpper = true;
            if(Character.isDigit(c)) hasDigit = true;
        }

        if(pass.length() >= 8 && hasUpper && hasDigit)
            System.out.println("Strong Password");
        else
            System.out.println("Weak Password");
    }
}
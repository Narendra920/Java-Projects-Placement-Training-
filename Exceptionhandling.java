import java.util.*;

class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 1000;

        try {
            System.out.print("Enter withdraw amount: ");
            int amt = sc.nextInt();

            if(amt > balance)
                throw new Exception("Insufficient Balance");

            balance -= amt;
            System.out.println("Remaining: " + balance);

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
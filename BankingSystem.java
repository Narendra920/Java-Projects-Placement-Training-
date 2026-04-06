import java.util.*;

class Bank {
    int balance = 1000;

    void deposit(int amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
    }

    void withdraw(int amt) {
        if(amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void showBalance() {
        System.out.println("Balance: " + balance);
    }
}

class Main {
    public static void main(String[] args) {
        Bank b = new Bank();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("1.Deposit 2.Withdraw 3.Balance 4.Exit");
            int ch = sc.nextInt();

            switch(ch) {
                case 1: b.deposit(sc.nextInt()); break;
                case 2: b.withdraw(sc.nextInt()); break;
                case 3: b.showBalance(); break;
                case 4: System.exit(0);
            }
        }
    }
}
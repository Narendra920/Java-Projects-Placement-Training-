import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter operator (+,-,*,/): ");
        char op = sc.next().charAt(0);

        if(op == '+')
            System.out.println("Result: " + (a + b));
        else if(op == '-')
            System.out.println("Result: " + (a - b));
        else if(op == '*')
            System.out.println("Result: " + (a * b));
        else if(op == '/')
            System.out.println("Result: " + (a / b));
        else
            System.out.println("Invalid");
    }
}
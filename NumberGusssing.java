import java.util.*;

class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = (int)(Math.random() * 100);

        int guess;
        do {
            System.out.print("Guess number: ");
            guess = sc.nextInt();

            if(guess > num)
                System.out.println("Too High");
            else if(guess < num)
                System.out.println("Too Low");

        } while(guess != num);

        System.out.println("Correct!");
    }
}
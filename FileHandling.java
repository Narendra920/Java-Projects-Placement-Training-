import java.io.*;
import java.util.*;

class Notes {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String data = sc.nextLine();

        FileWriter fw = new FileWriter("notes.txt", true);
        fw.write(data + "\n");
        fw.close();

        System.out.println("Saved!");
    }
}
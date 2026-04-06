import java.util.*;

class StackProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter expression: ");
        String exp = sc.next();

        Stack<Character> st = new Stack<>();

        for(char c : exp.toCharArray()) {
            if(c == '(')
                st.push(c);
            else if(c == ')') {
                if(st.isEmpty()) {
                    System.out.println("Not Balanced");
                    return;
                }
                st.pop();
            }
        }

        if(st.isEmpty())
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}
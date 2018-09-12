import java.util.Scanner;
import java.util.Stack;

public class TransformTheExpression {

    static int Prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String outputString = "";
            char[] strChar = sc.nextLine().toCharArray();

            for (char t : strChar) {
                if (Character.isLetterOrDigit(t)) {
                    outputString += t;
                } else if (t == '(') {
                    st.push(t);
                } else if (t == ')') {
                    while (!st.empty() && st.peek() != '(') {
                        outputString += st.pop();
                    }
                    if (!st.empty() && st.peek() != '(') {
                        throw new IllegalArgumentException();
                    } else {
                        st.pop();
                    }
                } else {
                    while (!st.empty() && Prec(t) <= Prec(st.peek())) {
                        outputString += st.pop();
                    }
                    st.push(t);
                }
            }
            while (!st.empty()) {
                outputString += st.pop();
            }
            System.out.println(outputString);
        }
    }

}

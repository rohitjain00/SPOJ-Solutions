import java.math.BigInteger;
import java.util.Scanner;

public class Factorial2 {

    public static String factorial(int n) {
        BigInteger fact = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(new BigInteger(i + ""));
        }
        return fact.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int j = 0; j < n; j++) {
            int num = sc.nextInt();
            System.out.println(factorial(num));
        }
    }
}

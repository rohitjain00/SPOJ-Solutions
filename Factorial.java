import java.util.Scanner;

public class Factorial {
    static int findZero(int n)
    {
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5)
            count += n / i;

        return count;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            System.out.println(findZero(num));
        }
    }
}

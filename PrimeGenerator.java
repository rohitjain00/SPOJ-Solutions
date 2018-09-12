import java.util.Scanner;

public class PrimeGenerator {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(n);
        sc.nextLine();
        int range[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            String temp[] = sc.nextLine().split("\\s+");
            range[i][0] = Integer.parseInt(temp[0]);
            range[i][1] = Integer.parseInt(temp[1]);
        }

        for (int i = 0; i < n; i++) {
            for (int j = range[i][0]; j <= range[i][1]; j++) {
                if (isPrime(j)) {
                    System.out.println(j);
                }
            }
            System.out.println();
        }
    }
}

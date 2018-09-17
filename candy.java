import java.util.ArrayList;
import java.util.Scanner;

public class candy {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (n != -1) {
            int[] arr = new int[n];
            double Avg = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sc.nextLine();
                Avg += arr[i];
            }
            Avg /= n;
            if (Avg % 1 != 0) {
                System.out.println(-1);
            } else {
                int steps = 0;
                for (int i = 0; i < n; i++) {
                    if (arr[i] > Avg) {
                        steps += (arr[i]-Avg);
                    }
                }
                System.out.println(steps);
            }
            n = sc.nextInt();
        }
    }
}

import java.util.Scanner;

public class feynman {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            int n = sc.nextInt();
            sc.nextLine();
            int count = 0;

            for(int i = 1; i <= n; i++) {
                count += (i*i);
            }
            if (count != 0)
                System.out.println(count);
            else
                System.out.println();
        }
    }
}

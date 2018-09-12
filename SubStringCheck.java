import java.util.Scanner;

public class SubStringCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 24; i++) {
            String str[] = sc.nextLine().split("\\s+");

            if (str[0].contains(str[1])) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}

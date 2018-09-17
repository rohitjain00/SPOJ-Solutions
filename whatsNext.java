import java.util.Scanner;

public class whatsNext {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String[] numbers = sc.nextLine().split(" ");
            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);
            int c = Integer.parseInt(numbers[2]);
            if (a == 0 && b == 0 && c== 0) {
                break;
            }
            if (b-a == c-b) {
                    System.out.println("AP " + (c+(b-a)));
            } else {
                System.out.println("GP " + (c*(b/a)));
            }
        }
    }
}

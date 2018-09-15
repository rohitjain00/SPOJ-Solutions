import java.util.Scanner;

public class NumberSteps {
    public static int calculate(int x, int y) {
        int num;
        if (y % 2 == 0) {
            y /= 2;
            num = y*4;
        } else {
            y--;
            y/= 2;
            num = (y*4) + 1;
        }
        return num;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String[] numbers = sc.nextLine().split(" ");
            int x = Integer.parseInt(numbers[0]);
            int y = Integer.parseInt(numbers[1]);
            if (x == y) {
                System.out.println(calculate(x,y));
            } else if (y == x-2) {
                if ((y+1) % 2 == 0) {
                    System.out.println(calculate(x - 1, y + 1) - 1);
                } else {
                    System.out.println(calculate(x - 1, y + 1) + 1);
                }
            } else {
                System.out.println("No Number");
            }
        }
    }
}

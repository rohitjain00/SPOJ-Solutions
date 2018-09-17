import java.util.Scanner;

public class Rectangles {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int total = 0;
    for (int n = 1; n <= Math.sqrt(num); n++) {
      int m = num/n;
      total += m -n + 1;
    }

    System.out.println(total);
  }
}

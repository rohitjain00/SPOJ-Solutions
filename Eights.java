import java.util.Scanner;

public class Eights {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sc.nextLine();
    for (int i = 0; i < n; i++) {
      long num = sc.nextLong();
      if (num == 1) {
        System.out.println(192);
      } else {
        System.out.println(192+((num-1)*250));
      }
    }
  }
}

import java.util.Scanner;

public class CRDS {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sc.nextLine();
    for (int i = 0; i < n; i++) {
      long num = sc.nextLong();
      if (i != n-1) {
        sc.nextLine();
      }

      System.out.println((((3*num*(num+1))/2)-num) % 1000007);
    }
  }
}

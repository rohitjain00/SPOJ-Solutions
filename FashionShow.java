import java.util.Arrays;
import java.util.Scanner;

public class FashionShow {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    for (int i = 0; i < n; i++) {
      int m = sc.nextInt();
      sc.nextLine();
      String[] InputArr = sc.nextLine().split(" ");
      int[] men = new int[m];
      for (int j = 0; j < m;j++) {
          men[j] = Integer.parseInt(InputArr[j]);
      }
      InputArr = sc.nextLine().split(" ");
      int[] women = new int[m];
      for (int j = 0; j < m; j++) {
        women[j] = Integer.parseInt(InputArr[j]);
      }
      Arrays.sort(men);
      Arrays.sort(women);
      int total = 0;
      for (int j = 0; j < m; j++) {
        total += (men[j]*women[j]);
      }

      System.out.println(total);
    }
  }
}

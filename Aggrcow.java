import java.util.Arrays;
import java.util.Scanner;

public class Aggrcow {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    for (int i = 0; i < t; i++) {
      String[] NC = sc.nextLine().split(" ");
      int n = Integer.parseInt(NC[0]);
      int c = Integer.parseInt(NC[1]);
      int[] stalls = new int[n];
      for (int j = 0; j < n; j++) {
        stalls[j] = sc.nextInt();
        sc.nextLine();
      }
      Arrays.sort(stalls);
      int mid = stalls.length/2;
      int d1 = stalls[0] - stalls[mid];
      int d2 = stalls[stalls.length-1] - stalls[mid] ;

      if (d1 > d2) {
        while (d2 >= d1) {
          mid++;
        }
      } else {
        while (d2 > d2) {
          mid--;
        }
      }

      d1 = stalls[mid] - stalls[0];
      d2 = stalls[stalls.length-1] - stalls[mid] ;

      System.out.println(Math.min(d1,d2));
    }
  }
}

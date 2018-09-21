import java.util.Scanner;
import java.util.Stack;

public class STPAR {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();

    while (n!= 0) {

      String[] arr = sc.nextLine().split(" ");
      Stack<Integer> st = new Stack<>();
      int currMobile = 1;

      for (int i = 0; i < n; i++) {

        if (Integer.parseInt(arr[i]) == currMobile) {
          currMobile++;

        } else {
          st.push(Integer.parseInt(arr[i]));

        }
      }
      while (st.pop() == currMobile) {
        currMobile++;

      }
      if (currMobile == n) {
        System.out.println("yes");

      } else {
        System.out.println("no");

      }
      n = sc.nextInt();
      sc.nextLine();
    }
  }
}

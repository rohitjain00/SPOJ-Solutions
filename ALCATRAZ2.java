import java.util.Scanner;

public class ALCATRAZ2 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[8];
    int total = 0;
    for (int i =0; i < 8;i ++) {
      arr[i] = sc.nextInt();
      total += arr[i];
    }
    sc.nextLine();
    int p = sc.nextInt();
    sc.nextLine();
    for (int i = 0; i< p; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      total -= Math.min(arr[a-1],arr[b-1]);
      if (i != p-1) {
        sc.nextLine();
      }
    }
    System.out.println(total);
  }
}

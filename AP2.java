import java.util.Scanner;

public class AP2 {

  static long findNumberOfTerms(long t1, long t2,long s) {
    return 2*s/(t1+t2);

  }

  static long findDIfference(long n, long t1, long t2) {
    return (t2-t1)/(n-5);
  }

  static void printAP (long n, long d, long t1) {
    long a = t1 - (2*d);

    for (long i = 0; i < n; i++,a += d) {
      System.out.print(a + " ");
    }
    System.out.println();
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    for (int i = 0; i < t; i++) {
      String[] arr = sc.nextLine().split(" ");
      long n = findNumberOfTerms(Long.parseLong(arr[0]), Long.parseLong(arr[1]), Long.parseLong(arr[2]));
      long d = findDIfference(n, Long.parseLong(arr[0]), Long.parseLong(arr[1]));
      System.out.println(n);
      printAP(n, d, Long.parseLong(arr[0]));
    }
  }
}
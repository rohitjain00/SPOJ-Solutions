import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BytelandianGoldCoins {

  static Map<Integer, Long> dp;

  static long f(int n) {
    if (n== 0) return 0;

    if (dp.containsKey(n)) return dp.get(n);

    long aux = f(n/2)  + f (n/3) + f(n/4);

    if (aux > n) dp.put(n,aux);
    else dp.put(n, (long) n);

    return dp.get(n);
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      int beforeExchange = sc.nextInt();
      sc.nextLine();
        System.out.println(f(beforeExchange));
    }
  }

}

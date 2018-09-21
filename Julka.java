import java.math.BigInteger;
import java.util.Scanner;

public class Julka {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 10; i++) {
      BigInteger t = new BigInteger(sc.nextLine());
      BigInteger s = new BigInteger(sc.nextLine());
      BigInteger n = new BigInteger(String.valueOf((t.subtract(s)).divide(new BigInteger("2"))));
      System.out.println(t.subtract(n));
      System.out.println((t.subtract(s)).divide(new BigInteger("2")));
    }
  }
}

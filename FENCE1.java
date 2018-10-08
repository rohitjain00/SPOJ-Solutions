import java.util.Scanner;

public class FENCE1 {

  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    Double circumfrence = sc.nextDouble();
    while (circumfrence > 0.0) {
      System.out.printf("%.2f\n", (((circumfrence * circumfrence) / (2 * 3.1415926)) * 100) / 100);
      circumfrence = sc.nextDouble();
    }
  }

}

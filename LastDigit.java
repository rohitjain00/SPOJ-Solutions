import java.util.Scanner;

public class LastDigit {
  static int Modulo(int a, char b[])
  {
    int mod = 0;
    for (int i = 0; i < b.length; i++)
      mod = (mod * 10 + b[i] - '0') % a;
    return mod;
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();

    for (int i = 0; i < n; i++) {
      String[] num = sc.nextLine().split(" ");
      int exp = (Modulo(4, num[1].toCharArray()) == 0) ? 4 : Modulo(4, num[1].toCharArray());

      int res = (int)(Math.pow(num[0].charAt(num[0].length()-1) - '0', exp));

      System.out.println(res%10);
    }
  }
}

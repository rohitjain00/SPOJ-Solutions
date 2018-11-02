import java.util.Scanner;

public class ADASEQEN {

  static int lcs( char[] X, char[] Y, int m, int n ,int[] price)
  {
    int L[][] = new int[m+1][n+1];

    for (int i=0; i<=m; i++)
    {
      for (int j=0; j<=n; j++)
      {
        if (i == 0 || j == 0)
          L[i][j] = 0;
        else if (X[i-1] == Y[j-1])
          L[i][j] = L[i-1][j-1] + price[X[i-1]-97];
        else
          L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
      }
    }
    return L[m][n];
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    sc.nextLine();
    int[] price = new int[26];
    for (int i = 0; i < 26; i++) {
      price[i] = sc.nextInt();
    }
    sc.nextLine();
    String a = sc.nextLine();
    String b = sc.nextLine();
    System.out.println(lcs(a.toCharArray(), b.toCharArray(), m, n, price));
  }
}

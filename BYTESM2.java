import static java.lang.StrictMath.max;

import java.util.Scanner;

public class BYTESM2 {

  public static int maxStones(int[][] mat) {
    int N = mat.length;
    int M = mat[0].length;
    int res = -1;
    for (int i = 0; i < M; i++)
      res = max(res, mat[0][i]);

    for (int i = 1; i < N; i++)
    {
      res = -1;
      for (int j = 0; j < M; j++)
      {
        if (j > 0 && j < M - 1)
          mat[i][j] += max(mat[i - 1][j],
              max(mat[i - 1][j - 1],
                  mat[i - 1][j + 1]));

        else if (j > 0)
          mat[i][j] += max(mat[i - 1][j],
              mat[i - 1][j - 1]);

          // When diagonal left is not possible
        else if (j < M - 1)
          mat[i][j] += max(mat[i - 1][j],
              mat[i - 1][j + 1]);

        res = max(mat[i][j], res);
      }
    }
    return res;
  }

  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);

    int n = sc.nextInt();
    sc.nextLine();
    for (int l = 0; l < n; l++) {
      String[] dimensions = sc.nextLine().split(" ");
      int rows = Integer.parseInt(dimensions[0]);
      int columns = Integer.parseInt(dimensions[1]);
      int twoD[][] = new int[rows][columns];

      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
          twoD[i][j] = sc.nextInt();
        }
      }

      System.out.println(maxStones(twoD));
      sc.nextLine();
    }
  }
}

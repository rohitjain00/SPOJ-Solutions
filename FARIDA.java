import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FARIDA {

  public static void main(String args[]) {
    FastReader sc = new FastReader();
    int testCases = sc.nextInt();
    for (int testCaseCount = 1; testCaseCount <= testCases; testCaseCount++) {
      int arrCount = sc.nextInt();
      int[] arr = new int[arrCount];
      for (int i = 0; i < arrCount; i++) {
        arr[i] = sc.nextInt();
      }
      System.out.println("Case " + testCaseCount + ": " + countMaxCoins(arr,0));
    }
  }

  public static long countMaxCoins(int[] arr, int currIndex) {
    if (arr.length == 0) {
      return 0;
    }
    if (arr.length == 1) {
      return arr[0];
    }
    if (arr.length == 2) {
      return Math.max(arr[0],arr[1]);
    }
    if (currIndex >= arr.length) {
      return 0;
    }
    long coinsHave = arr[0] + countMaxCoins(arr,currIndex + 2);
    long coinsLeave = countMaxCoins(arr, currIndex+1);
    return Math.max(coinsHave,coinsLeave);

  }

  static class FastReader
  {
    BufferedReader br;
    StringTokenizer st;

    public FastReader()
    {
      br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next()
    {
      while (st == null || !st.hasMoreElements())
      {
        try
        {
          st = new StringTokenizer(br.readLine());
        }
        catch (IOException e)
        {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt()
    {
      return Integer.parseInt(next());
    }

    long nextLong()
    {
      return Long.parseLong(next());
    }

    double nextDouble()
    {
      return Double.parseDouble(next());
    }

    String nextLine()
    {
      String str = "";
      try
      {
        str = br.readLine();
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
      return str;
    }
  }
}

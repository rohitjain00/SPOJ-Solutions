import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EQBOX {

  public static void main(String args[]) {
    FastReader sc = new FastReader();
    int testCaseCount = sc.nextInt();
    while (testCaseCount > 0) {

      int a = sc.nextInt();
      int b = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();

      if (a*b >= x*y) {
        System.out.println("Escape is possible.");
      } else {
        System.out.println("Box cannot be dropped.");
      }
      testCaseCount--;
    }
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

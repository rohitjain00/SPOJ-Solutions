import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AMR10G {
  public static void main(String args[]) {
    FastReader sc = new FastReader();
    int testCaseCount = sc.nextInt();

    while (testCaseCount > 0) {
      int heightArrayCount = sc.nextInt();
      int soldiersToSelectCount = sc.nextInt();
      int[] heightArray = new int[heightArrayCount];
      for (int i = 0; i < heightArrayCount; i++) {
        heightArray[i] = sc.nextInt();
      }
      Arrays.sort(heightArray);
      int minDiffGroup = Integer.MAX_VALUE;
      for (int i = 0; i+soldiersToSelectCount <= heightArrayCount; i++) {
        if (heightArray[i + soldiersToSelectCount -1] - heightArray[i] < minDiffGroup) {
          minDiffGroup = heightArray[i + soldiersToSelectCount -1] - heightArray[i];
        }
      }
      System.out.println(minDiffGroup);
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

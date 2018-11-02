import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ALTSEQ {
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

  public static int subSeqCount(int[] arr, int n) {
    int lis[] = new int[n];
    int i,j,max = 0;

    for ( i = 0; i < n; i++ )
      lis[i] = 1;

    for (i = 1; i < n; i++)
      for (j = 0; j < i; j++)
        if (Math.abs(arr[i]) > Math.abs(arr[j]) && Math.abs(lis[i]) < Math.abs(lis[j]) + 1) {
          if ((arr[i] < 0 && arr[j] > 0) || (arr[i] > 0 && arr[j] < 0)) {
            lis[i] = lis[j] + 1;
          }
          }

    for ( i = 0; i < n; i++ )
      if ( max < lis[i] )
        max = lis[i];

    return max;
  }

  public static void main(String args[]) {
    FastReader sc = new FastReader();
    int arrSize = sc.nextInt();
    int[] arr = new int[arrSize];
    for (int arrIndex = 0; arrIndex < arrSize; arrIndex++) {
      arr[arrIndex] = sc.nextInt();
    }
      System.out.println(subSeqCount(arr,arr.length));
  }
}

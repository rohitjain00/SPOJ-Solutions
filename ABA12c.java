import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ABA12c {
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
        catch (IOException  e)
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

  public static int lowestMoney(int[] arr, int K, int N) {
    int[] ans = new int[K+1];
    for (int i =1; i <= K;i++) {
      ans[i] = arr[i];
    }
    for (int i = 2; i <= K; i++) {
      for (int j = 1; j < i;j++) {
        if (arr[i-j] == -1 || ans[j] == -1) {
          continue;
        }
        if (ans[i] == -1) {
          ans[i] = ans[j] + arr[i-j];
        } else {
          ans[i] = Math.min(ans[i],ans[j] + arr[i-j]);
        }
      }
      for (int j = 1;j <=K;j++) {
        System.out.print(ans[j] + " ");
      }
      System.out.println();
    }
    if (K == 0) {
      return 0;
    }
    else
      return ans[K];
  }

  public static void main(String args[]) {
    FastReader st = new FastReader();
    int t = st.nextInt();
//    st.nextLine();

    for (int j= 0; j < t; j++) {
      int N = st.nextInt();
      int K = st.nextInt();
      int[] price = new int[K+1];
      for (int i = 1; i <= K; i++) {
        price[i] = st.nextInt();
      }
//      for (int i =0 ; i< K; i++) {
//        System.out.print(price[i] + " ");
//      }
//      System.out.println();
      int ans = lowestMoney(price,K,N);
      if (ans == 0) {
        System.out.println("-1");
      } else {
        System.out.println(ans);
      }
    }
  }
}
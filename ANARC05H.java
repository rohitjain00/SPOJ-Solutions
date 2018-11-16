import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ANARC05H {
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
  public static long findGroups(String s,int leftSum, int start ,int end, int sum) {
    int total = 0;
    int rightsum = 0;
    long groupsFormed = 0;
    for(int i = start ; i <= end; i++) {
      total += ((int) s.charAt(i));
      rightsum -= ((int) s.charAt(i));
      if (i == end && total >= leftSum) {
        groupsFormed++;
      } else if (total >= leftSum && total <= rightsum) {
        groupsFormed += findGroups(s,total,i+1,end,rightsum);
      }
    }
    return groupsFormed;
  }
  public static void main(String args[]) {
    FastReader sc = new FastReader();
    while (true) {
      String s = sc.nextLine();
      if (s.equals("bye")) {
        break;
      }
      int sum = 0;
      for (int i = 0; i < s.length();i++) {
        sum += (int) s.charAt(i);
      }
      System.out.println(findGroups(s,0,0,s.length()-1,sum));
    }
  }
}

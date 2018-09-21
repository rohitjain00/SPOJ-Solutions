import java.io.*;
import java.math.BigInteger;

public class candy3 {

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);
    int testcases =  Integer.parseInt(in.readLine());
    for (int t = 0; t < testcases; t++) {
      in.readLine();
      int n = Integer.parseInt(in.readLine());
      BigInteger sum = BigInteger.ZERO;
      for (int i = 0; i < n; i++)
        sum = sum.add(new BigInteger(in.readLine()));
      if (sum.mod(new BigInteger(Integer.toString(n))).equals(BigInteger.ZERO))
        out.println("YES");
      else
        out.println("NO");
    }
    out.flush();
  }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CANTON {

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);
    int testcases = Integer.parseInt(in.readLine());
    for (int t = 0; t < testcases; t++) {
      int n = Integer.parseInt(in.readLine());
      int d = (int) Math.ceil((Math.sqrt(8*n+1)-1)/2.0);
      int i = n - d*(d-1)/2;
      if ((d & 1) == 0)
        out.printf("TERM %d IS %d/%d\n", n, i, d-i+1);
      else
        out.printf("TERM %d IS %d/%d\n", n, d-i+1, i);
    }
    out.flush();
  }
  }

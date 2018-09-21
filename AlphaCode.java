import java.util.Scanner;

public class AlphaCode {
    public static void main(String args[]) {
      int L;
      char[] arr;
      Scanner sc = new Scanner(System.in);
      while (true) {
        arr = sc.nextLine().toCharArray();
        if (arr[0] == '0') break;

        long[] dp = new long[arr.length+1];
        dp[0] = 1;
        for(int i = 0; i < arr.length; i++) {
          if(arr[i] > '0' && arr[i] <= '9') dp[i+1] += dp[i];
          if(i > 0) {
            int test = (arr[i-1]-'0')*10+(arr[i]-'0');
            if(test >= 10 && test <= 26) dp[i+1] += dp[i-1];
          }
        }
        System.out.println(dp[arr.length]);
      }
    }
}

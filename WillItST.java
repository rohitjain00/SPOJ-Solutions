import java.util.Scanner;

public class WillItST {
  static boolean isPowerOfTwo (long x) {
    //bit operation to check if x and its complement that is x-1 is 0
    //for example 8 =  1000
    //while (8-1)=7 =  0111
    //                 ----
    //using & in both  0000 = 0
    return x!=0 && ((x&(x-1)) == 0);

  }
  public static void main(String args[]) {
    Scanner sc= new Scanner(System.in);
    long num = sc.nextLong();

    if(isPowerOfTwo(num)) {
      System.out.println("TAK");
    } else {
      System.out.println("NIE");
    }
  }
}

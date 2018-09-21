import java.util.Scanner;

public class Hangover {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    while(true)
    {
      double d = sc.nextDouble();
      if(d == 0.0) break;
      double at = 0;
      int i = 2;
      while(true)
      {
        at += 1.0/i;
        if(at >= d) break;
        i++;
      }
      System.out.println((i-1)+" card(s)");
    }
  }

}

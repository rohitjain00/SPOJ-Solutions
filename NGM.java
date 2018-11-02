import java.util.Scanner;

public class NGM {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    long num = sc.nextLong();
    if(num % 10 == 0){
      System.out.println("2");
    }
    else{
      System.out.println("1");
      System.out.printf("%d\n", num%10);
    }
  }
}

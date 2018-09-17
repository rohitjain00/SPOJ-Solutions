import java.util.Scanner;

public class ToAndFro {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      int n = sc.nextInt();
      sc.nextLine();
      if (n == 0) {
        break;
      }
      String encryptedMessage = sc.nextLine();
      String decryptedMessage = "";

      for (int i = 0; i < n; i++) {
        for (int j = i; j < encryptedMessage.length(); j+= n) {
          int isLeft = j/n;
          if (isLeft % 2 == 0) {
            decryptedMessage += encryptedMessage.charAt(j);
          } else {
            decryptedMessage += encryptedMessage.charAt(n+j-(2*i)-1);
          }
        }
      }
      System.out.println(decryptedMessage);
    }
  }
}

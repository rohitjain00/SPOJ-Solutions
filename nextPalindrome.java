import java.util.Scanner;

public class nextPalindrome {

  static void generateNextPalindromeUtil(int num[], int n)
  {
    int mid = n / 2;
    int i = mid - 1;
    int j = (n % 2 == 0) ? mid : mid + 1;
    boolean leftsmaller = false;
    while (i >= 0 && num[i] == num[j]) {
      i--;
      j++;
    }
    if (i < 0 || num[i] < num[j]) {
      leftsmaller = true;
    }
    while (i >= 0) {
      num[j++] = num[i--];
    }

    if (leftsmaller){
      int carry = 1;
      if (n % 2 == 1) {
        num[mid] += 1;
        carry = num[mid] / 10;
        num[mid] %= 10;
      }
      i = mid - 1;
      j = (n % 2 == 0 ? mid : mid + 1);

      while (i >= 0) {
        num[i] = num[i] + carry;
        carry = num[i] / 10;
        num[i] %= 10;
        num[j] = num[i];
        i--;
        j++;
      }
    }
  }

  static boolean isAll9(int num[], int n) {
    for (int i = 0; i < n; i++)
      if (num[i] != 9)
        return false;
    return true;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    sc.nextLine();

    for (int i = 0; i < n; i++) {
      char[] arr = sc.nextLine().toCharArray();
      int [] num = new int[arr.length];
      for (int j = 0; j < arr.length; j++) {
        num[j] = (int)arr[j];
      }
      if (isAll9(num, n)) {
        System.out.print("1");
        for (int k = 0; k < n - 1; k++)
          System.out.print("0");
        System.out.println("1");

      }
      else {
        generateNextPalindromeUtil(num, n);
        for(int k = 0; k< num.length;k++) {
          System.out.print(num[k]);
        }
        System.out.println();
      }

    }

  }

}

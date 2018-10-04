import java.util.HashMap;
import java.util.Scanner;

public class HPYNOS {

  public static String strSquare(String str) {
    long toReturn = 0;
    for (char i : str.toCharArray()) {
      toReturn += (Integer.parseInt(String.valueOf(i))*Integer.parseInt(String.valueOf(i)));
    }
    return String.valueOf(toReturn);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    HashMap<String, Boolean> map = new HashMap<>();
    int total = 0;
    boolean canComplete = true;
    while (!input.equals("1")) {
      if (map.containsKey(input)) {
        System.out.println("-1");
        canComplete = false;
        break;
      } else {
        map.put(input, true);
        total++;
      }
      input = strSquare(input);
    }
    if (canComplete) {
      System.out.println(total);
    }
  }
}

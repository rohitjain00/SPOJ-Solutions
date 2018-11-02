import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class ADACHES2 {

  //key represents the row of the array;
  //value int represents the col of the array;
//  private static HashMap<Integer, Integer> map;

  static boolean isIntersecting(int i, int j, HashMap<Integer,Integer> map) {
    if (map.containsKey(i)) {
      return true;
    }
    else if (map.containsValue(j)) {
      return true;
    }
    else {
      Set keys = map.keySet();
      for(Object key: keys){
        if ((Math.abs(map.get(key) - j) == 1) && (Math.abs(Integer.valueOf(String.valueOf(key)) - i)
            == 1)) {
          return true;
        }
        if ((map.get(key)-j) == 1 && (Integer.parseInt(String.valueOf(key))-i) == 1) {
          return true;
        }
      }
    }
    return false;
  }


  public static long noPlaced(int n, int col,int toPlace,
      HashMap<Integer,Integer> map) {
    int[] dp = new int[n+1];
    long count = 0;
    if (toPlace == 0) {
      return 1;
    }

    if (col >= n) {
      return 0;
    }

    else {
      for (int i = n-1; i >= 0; i--) {
          if (!isIntersecting(i, col,map)) {
            map.put(i, col);
//          if (col == n-1) {
//              printMap(map);
//          }
            count += noPlaced(n-1,col+1, toPlace-1,map)% 1000000007 +
                noPlaced(n,col+1, toPlace-1,map)% 1000000007;
            map.remove(i,col);
        }
      }
    }
//    printMap(map);

return count% 1000000007;
  }

  public static void printMap(HashMap<Integer,Integer> map) {
    Set keys = map.keySet();
    System.out.println("All keys are: " + keys);
// To get all key: value
    for(Object key: keys){
      System.out.println(key + ": " + map.get(key));
    }
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0;i  < t; i++) {
      HashMap<Integer,Integer> map = new HashMap<>();
      int num = sc.nextInt();
      System.out.println(noPlaced(num,0,num,map));
      if (i != t-1) {
        sc.nextLine();
      }
    }
  }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ANARC05B {
  static class FastReader
  {
    BufferedReader br;
    StringTokenizer st;

    public FastReader()
    {
      br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next()
    {
      while (st == null || !st.hasMoreElements())
      {
        try
        {
          st = new StringTokenizer(br.readLine());
        }
        catch (IOException e)
        {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt()
    {
      return Integer.parseInt(next());
    }

    long nextLong()
    {
      return Long.parseLong(next());
    }

    double nextDouble()
    {
      return Double.parseDouble(next());
    }

    String nextLine()
    {
      String str = "";
      try
      {
        str = br.readLine();
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
      return str;
    }
  }
  static int binarySearch(int arr[], int l, int r, int x)
  {
    if (r>=l)
    {
      int mid = l + (r - l)/2;
      if (arr[mid] == x)
        return mid;
      if (arr[mid] > x)
        return binarySearch(arr, l, mid-1, x);
      return binarySearch(arr, mid+1, r, x);
    }
    return -1;
  }

  public static int maxSum (int[] arr1, int[] arr2) {
    int prevIntersectionPointArr1 = 0;
    int prevIntersectionPointArr2 = 0;
    int currIntersectionPointArr1 = 0;
    int currIntersectionPointArr2 = 0;
    int totalSum = 0;
    for (int i = 0; i < arr1.length; i++) {
      int indexOfElemArr2 = binarySearch(arr2,0,arr2.length-1,arr1[i]);
      if (indexOfElemArr2 == -1) {
        continue;
      } else {
        currIntersectionPointArr1 = i;
        currIntersectionPointArr2 = indexOfElemArr2;
        totalSum += maxSumOfTwoArr(arr1,prevIntersectionPointArr1,currIntersectionPointArr1,arr2,prevIntersectionPointArr2,currIntersectionPointArr2);
        prevIntersectionPointArr1 = currIntersectionPointArr1;
        prevIntersectionPointArr2 = currIntersectionPointArr2;
      }
    }
    totalSum += maxSumOfTwoArr(arr1,prevIntersectionPointArr1,arr1.length,arr2,prevIntersectionPointArr2,arr2.length);
    return totalSum;
  }

  private static int maxSumOfTwoArr(int[] arr1, int l1, int r1,int[] arr2, int l2, int r2)  {
    int sum1 = 0;
    int sum2 = 0;
    for (int i = l1; i < r1; i++) {
      sum1 += arr1[i];
    }
    for (int i = l2; i < r2; i++) {
      sum2 += arr2[i];
    }
//    System.out.println(sum1+" "+ sum2);
    return Math.max(sum1,sum2);
  }

  public static void main(String args[]) {
    FastReader sc = new FastReader();
    while (true) {
      int arr1Size = sc.nextInt();
      if (arr1Size == 0) {
        break;
      }
      int[] arr1 = new int[arr1Size];
      for (int i = 0; i < arr1Size; i++) {
        arr1[i] = sc.nextInt();
      }
      int arr2Size = sc.nextInt();
      int[] arr2 = new int[arr2Size];
      for (int i = 0; i < arr2Size; i++) {
        arr2[i] = sc.nextInt();
      }
      System.out.println(maxSum(arr1,arr2));
    }
  }
}

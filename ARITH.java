import java.util.*;
import java.lang.*;

class Main
{
    public static void add(int a, int b, boolean toAdd) {
        int lenA = String.valueOf(a).length();
        int lenB = String.valueOf(b).length();
        int lenAns = toAdd ? String.valueOf(a+b).length() :String.valueOf(a-b).length() ;
        int lenMax = (lenA > lenB) ? lenA : lenB;
        lenMax++;

        for (int i = lenA; i < lenMax; i++) {
            System.out.print(" ");
        }
        System.out.println(a);
        if (toAdd) {
            System.out.print("+");
        } else {
            System.out.print("-");
        }
        for (int i = lenB; i < lenMax-1; i++) {
            System.out.print(" ");
        }
        System.out.println(b);
        for (int i = 0; i < lenMax; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = lenAns; i < lenMax; i++) {
            System.out.print(" ");
        }
        if (toAdd) {
            System.out.println(a + b);
        }else {
            System.out.print(a - b);
        }
    }

    public static void multiply(int a, int b) {
        int lenA = String.valueOf(a).length();
        int lenB = String.valueOf(b).length();
        int lenAns = String.valueOf(a*b).length();
        int lenMax = lenAns;
        int maxAB = (lenA > lenB) ? lenA : lenB;

        String temp = Integer.toString(b);
        int[] bArr = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            bArr[i] = temp.charAt(i) - '0';
        }

        lenMax++;
        for (int i = lenA; i < lenMax; i++) {
            System.out.print(" ");
        }
        System.out.println(a);
        for (int i = lenB; i < lenMax-1; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println(b);
        for (int i = maxAB; i < lenMax-1; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < maxAB+1; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i< bArr.length;i++) {
            int currNum = bArr[bArr.length-i-1]*a;
            if (bArr[bArr.length-i-1] == 0) {
                currNum = 0;
            }
            for(int j = String.valueOf(currNum).length(); j < lenMax; j++) {
                System.out.print(" ");
            }
            System.out.println(currNum);
            lenMax--;
        }
        lenMax += bArr.length;
        for (int i = 0; i < lenMax; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println(a*b);
    }


    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String query = sc.nextLine();
            if (query.contains("+")) {
                String[] parts = query.split("\\+");
                add(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),true);
                System.out.println();
            } else if (query.contains("-")) {
                String[] parts = query.split("\\-");
                add(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),false);
                System.out.println();
            } else {
                String[] parts = query.split("\\*");
                multiply(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]));
                System.out.println();
            }
        }
    }
}
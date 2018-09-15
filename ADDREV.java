import java.util.Scanner;

public class ADDREV {
    public static String reverse(String a) {
        String temp = "";
        for (int j = a.length()-1; j >=0; j--) {
            temp += a.charAt(j);
        }
        return temp;
    }
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String[] number = sc.nextLine().split(" ");
            String tempA = reverse(number[0]);
            String tempB = reverse(number[1]);
            System.out.println(Integer
                    .parseInt(reverse(String.valueOf(Integer.parseInt(tempA) + Integer.parseInt(tempB)))));
        }
    }
}

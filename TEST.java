import java.util.Scanner;

public class TEST {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int currElem = sc.nextInt();

        while (currElem != 42) {

            System.out.println(currElem);
            currElem = sc.nextInt();
        }
    }
}

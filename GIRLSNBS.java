import java.util.Scanner;

public class GIRLSNBS {

  public static void main(String args[]) {
    Scanner st = new Scanner(System.in);
    int G = st.nextInt();
    int B = st.nextInt();
    int x,y;
    while (G != -1 && B != -1) {
      if (G == B) {
        if (G == 0) {
          System.out.println(0);
        } else {
          System.out.println(1);
          }
        } else {
        if(G > B) {
          x = G;
          y = B;
        } else {
          x = B;
          y = G;
        }
        if((x%(y+1))==0) {
          System.out.println(x/(y+1));
        } else {
          System.out.println(x/(y+1)+1);
        }
      }
      G = st.nextInt();
      B = st.nextInt();
    }
  }

}

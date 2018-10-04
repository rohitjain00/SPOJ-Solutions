import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class PTO7Y {

  static class Graph {

    private int V;
    LinkedList<Integer> adj[];

    Graph(int V) {
      this.V = V;
      for (int i = 0 ; i< V; i++) {
          adj[i]= new LinkedList<>();
      }
    }
    void addEdge(int v, int w) {
      adj[v].add(w);
      adj[w].add(v);
    }
    Boolean isTreeTopology(int v, boolean[] visited, int parent) {
      visited[v] = true;
      int i;

      Iterator<Integer> it = adj[v].iterator();
      while (it.hasNext()) {
        i = it.next();

        if (!visited[i]) {
          if (isTreeTopology(i,visited,v)) {
            return true;
          }
        } else  if (i != parent){
          return true;
        }
      }
      return false;
    }
    boolean isTree() {
      boolean[] visited = new boolean[this.V];
      for (int i = 0 ; i < this.V; i++) {
        visited[i] = false;
      }

      if (!isTreeTopology(1,visited,-1)) {
        return false;
      }

      for (int i = 0; i < this.V; i++) {
        if (!visited[i]) {
          return false;
        }
      }
      return true;
    }
  }

public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
    int[] MN =
        Arrays.asList(sc.nextLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
    Graph G = new Graph(MN[0] + 1);
    for (int i = 0; i < MN[1]; i++) {
      int[] Edge =
          Arrays.asList(sc.nextLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
      G.addEdge(Edge[0], Edge[1]);
    }
    if (G.isTree()) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}

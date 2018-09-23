import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class PTO7Y {

  static class Graph {
    int V;
    LinkedList<Integer> adjListArray[];

    // constructor
    Graph(int V) {
      this.V = V;
      adjListArray = new LinkedList[V];
      for(int i = 0; i < V ; i++){
        adjListArray[i] = new LinkedList<>();
      }
    }
    public int V() {
      return V;
    }
  }
  static void addEdge(Graph graph, int src, int dest) {
    graph.adjListArray[src].addFirst(dest);
    graph.adjListArray[dest].addFirst(src);
  }

  static boolean hasLoop(Graph G, int i, boolean[] visited) {



      Iterator<Integer> adj = G.adjListArray[i].iterator();
      while (adj.hasNext()) {
        int
        hasLoop(G, adj.next(),visited);
      }
      visited[i] = true;
    }
    return true;

  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int[] MN =  Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    Graph G = new Graph(MN[0]);
    Boolean[] visited = new Boolean[MN[0]];
    for (int i = 0; i < MN[1]; i++) {
      int[] temp =  Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      addEdge(G,temp[0],temp[1]);
    }
    if (hasLoop(G,1,visited)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}

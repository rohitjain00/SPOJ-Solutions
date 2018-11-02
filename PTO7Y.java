import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class PTO7Y {
  static class Graph {
    private int V;   // No. of vertices
    private LinkedList<Integer> adj[]; // Adjacency List Represntation

    // Constructor
    Graph(int v) {
      V = v;
      adj = new LinkedList[v];
      for(int i=0; i<v; ++i)
        adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int v,int w) {
      adj[v].add(w);
      adj[w].add(v);
    }

    // A recursive function that uses visited[] and parent to detect
    // cycle in subgraph reachable from vertex v.
    Boolean isCyclicUtil(int v, Boolean visited[], int parent)
    {
      // Mark the current node as visited
      visited[v] = true;
      Integer i;

      // Recur for all the vertices adjacent to this vertex
      Iterator<Integer> it = adj[v].iterator();
      while (it.hasNext())
      {
        i = it.next();

        // If an adjacent is not visited, then recur for that
        // adjacent
        if (!visited[i])
        {
          if (isCyclicUtil(i, visited, v))
            return true;
        }

        // If an adjacent is visited and not parent of current
        // vertex, then there is a cycle.
        else if (i != parent)
          return true;
      }
      return false;
    }

    // Returns true if the graph contains a cycle, else false.
    Boolean isCyclic()
    {
      // Mark all the vertices as not visited and not part of
      // recursion stack
      Boolean visited[] = new Boolean[V];
      for (int i = 0; i < V; i++)
        visited[i] = false;

      // Call the recursive helper function to detect cycle in
      // different DFS trees
      for (int u = 0; u < V; u++)
        if (!visited[u]) // Don't recur for u if already visited
          if (isCyclicUtil(u, visited, -1))
            return true;

      return false;
    }
  }


  public static void main(String args[]) {
    Scanner st = new Scanner(System.in);
    int N = st.nextInt();
    int M = st.nextInt();
    st.nextLine();
    Graph g = new Graph(N+1);
    for (int i = 0; i < M;i++) {
      g.addEdge(st.nextInt(),st.nextInt());
      if (i != M-1) {

      }
    }
    if (g.isCyclic()) {
      System.out.print("NO");
    } else {
      System.out.print("YES");
    }
  }
}
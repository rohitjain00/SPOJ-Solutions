import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;



class PT07Z {
  private static BufferedReader br;

  public static int[] findLongestPath(Integer callingVertex, Integer newVertex, ArrayList<ArrayList<Integer>> al) {
    int[] longestPath = {0, 0};
    int[] maxPaths = {0, 0};
    ArrayList<Integer> neighbors = al.get(newVertex);

    for(int i = 0; i < neighbors.size(); i++) {
      if(neighbors.get(i).equals(callingVertex))
        continue;

      int pathLength[] = findLongestPath(newVertex, neighbors.get(i), al);

      if(pathLength[1] > longestPath[1])
        longestPath[1] = pathLength[1];

      if(pathLength[0]+1 > maxPaths[0]) {
        if(maxPaths[0] > maxPaths[1])
          maxPaths[1] = maxPaths[0];

        maxPaths[0] = pathLength[0] + 1;
      }
      else if(pathLength[0]+1 > maxPaths[1]) {
        if(maxPaths[1] > maxPaths[0])
          maxPaths[0] = maxPaths[1];

        maxPaths[1] = pathLength[0] + 1;
      }
    }

    if((maxPaths[0] + maxPaths[1]) > longestPath[1])
      longestPath[1] = maxPaths[0] + maxPaths[1];

    longestPath[0] = (maxPaths[0] > maxPaths[1]) ? maxPaths[0] : maxPaths[1];

    return longestPath;
  }

  public static void main(String[] args) throws Exception {
    br = new BufferedReader(new InputStreamReader(System.in));
    int numNodes = Integer.parseInt(br.readLine());
    ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();

    for(int i = 0; i <= numNodes; i++) {
      al.add(new ArrayList<Integer>());
    }

    for(int i = 0; i < numNodes-1; i++) {
      String[] edge = br.readLine().split(" ");
      Integer u = Integer.parseInt(edge[0]);
      Integer v = Integer.parseInt(edge[1]);

      al.get(u).add(v);
      al.get(v).add(u);
    }


    int[] paths = findLongestPath(0, 1, al);
    System.out.println((paths[0] > paths[1]) ? paths[0] : paths[1]);
  }

}
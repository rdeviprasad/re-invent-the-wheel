import java.io.*;
import java.util.*;

public class SolutionG {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        int[] indegree = new int[n];
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(reader.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph.get(x - 1).add(y - 1);
            indegree[y - 1]++;
        }
        Set<Integer> visited = new HashSet<>();
        int[] distance = new int[n];
        for(int i = 0; i < n; i++) {
            if(!visited.contains(i) && indegree[i] == 0) {
                dfs(i, graph, visited, distance, indegree);
            }
        }
        
        int ans = 0;
        for(int d : distance) {
            ans = Math.max(ans, d);
        }
        writer.println(ans);
        writer.close();
    }

    private static void dfs(int u, List<List<Integer>> graph, Set<Integer> visited, int[] distance, int[] indegree) {
        visited.add(u);
        for(int v : graph.get(u)) {
            distance[v] = Math.max(distance[v], distance[u] + 1);
            --indegree[v];
            if(indegree[v] == 0) {
                dfs(v, graph, visited, distance, indegree);
            }
        }
    }
}

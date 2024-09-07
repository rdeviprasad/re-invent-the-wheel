import java.io.*;
import java.util.*;

public class SolutionA {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int n = Integer.parseInt(reader.readLine());
        int[] heights = new int[n + 1];
        StringTokenizer st = new StringTokenizer(reader.readLine());
        for(int i = 1; i <= n; i++) {
            heights[i] = Integer.parseInt(st.nextToken());
        }
        int[] dp = new int[n + 1];
        dp[1] = 0;
        dp[2] = Math.abs(heights[2] - heights[1]);
        for(int i = 3; i <= n; i++) {
            dp[i] = Math.min(dp[i - 1] + Math.abs(heights[i] - heights[i - 1]), dp[i - 2] + Math.abs(heights[i] - heights[i - 2]));
        }
        writer.println(dp[n]);
        writer.close();
    }
}

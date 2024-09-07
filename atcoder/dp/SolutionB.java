import java.io.*;
import java.util.*;

public class SolutionB {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int inf = (int)(1e9+5);
        int[] heights = new int[n];
        st = new StringTokenizer(reader.readLine());
        for(int i = 0; i < n; i++) {
            heights[i] = Integer.parseInt(st.nextToken());
        }
        int[] dp = new int[n];
        Arrays.fill(dp, inf);
        dp[0] = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 1; j <= k; j++) {
                if(i - j >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(heights[i] - heights[i - j]));
                }
            }
        }
        writer.println(dp[n - 1]);
        writer.close();
    }
}

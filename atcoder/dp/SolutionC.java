import java.io.*;
import java.util.*;

public class SolutionC {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[][] happiness = new int[n][3];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(reader.readLine());
            happiness[i][0] = Integer.parseInt(st.nextToken());
            happiness[i][1] = Integer.parseInt(st.nextToken());
            happiness[i][2] = Integer.parseInt(st.nextToken());
        }
        int[][] dp = new int[n + 1][3];
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < 3; j++) {
                for(int k = 0; k < 3; k++) {
                    if(j != k) {
                        dp[i][j] = Math.max(dp[i][j], dp[i - 1][k] + happiness[i - 1][j]);
                    }
                }
            }
        }
        int result = Math.max(dp[n][0], Math.max(dp[n][1], dp[n][2]));
        writer.println(result);
        writer.close();
    }
}

import java.io.*;
import java.util.*;

public class SolutionF {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        String s = reader.readLine();
        String t = reader.readLine();
        int n = s.length();
        int m = t.length();
        int[][] dp = new int[n + 1][m + 1];
        dp[0][0] = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if(s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        int i = n, j = m;
        StringBuilder sb = new StringBuilder();
        while(i > 0 && j > 0) {
            if(s.charAt(i - 1) == t.charAt(j - 1)) {
                sb.append(s.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                // sb.append(s.charAt(i - 2));
                i--;
            } else {
                // sb.append(t.charAt(j - 2));
                j--;
            }
        }
        writer.println(new String(sb.reverse()));
        writer.close();
    }
}

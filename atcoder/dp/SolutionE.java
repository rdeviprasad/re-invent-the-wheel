import java.io.*;
import java.util.*;

public class SolutionE {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(st.nextToken());
        long W = Long.parseLong(st.nextToken());
        long[] w = new long[N];
        long[] v = new long[N];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(reader.readLine());
            w[i] = Long.parseLong(st.nextToken());
            v[i] = Long.parseLong(st.nextToken());
        }
        long[] dp = new long[(int) (W + 1)];
        for(int i = 0; i < N; i++) {
            for(int j = (int) W; j >= w[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - (int)w[i]] + v[i]);
            }
        }
        writer.println(dp[W]);
        writer.close();
    }
}

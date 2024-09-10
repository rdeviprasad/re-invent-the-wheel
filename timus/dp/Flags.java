import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Flags {
    public static void main(String[] args) throws IOException {
      new Solver().run();
    }

    private static class Solver {

        StreamTokenizer in;
        PrintWriter out;

        int nextInt() throws IOException {
            in.nextToken();
            return (int) in.nval;
        }

        long nextLong() throws IOException {
            in.nextToken();
            return (long) in.nval;
        }

        void run() throws IOException {
            in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
            out = new PrintWriter(System.out);
            solve();
            out.flush();
        }

        void solve() throws IOException {
            int n = nextInt();
            long[][] dp = new long[n + 1][3];
            dp[0][0] = dp[0][1] = dp[0][2] = 0l;
            dp[1][0] = 1l;
            dp[1][1] = 1l;
            dp[1][2] = 0l;
            for(int i = 2; i <= n; i++) {
                dp[i][0] = dp[i - 1][1] + dp[i - 2][1];
                dp[i][1] = dp[i - 1][0] + dp[i - 2][0];
                dp[i][2] = dp[i - 1][0] + dp[i - 1][1]; 
            }
            out.print(dp[n][0] + dp[n][1]);
            out.print("\n");
        }
    }
}

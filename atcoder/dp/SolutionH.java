import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class SolutionH {
    public static void main(String[] args) throws IOException {
      new Solver().run();
    }

    private static class Solver {

        BufferedReader br;
		StringTokenizer st;
        PrintWriter out;
		
        String next() {
			while (!st.hasMoreTokens())
				try { 
                    st=new StringTokenizer(br.readLine());				               
                } catch (IOException e) {}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}

        void run() throws IOException {
            br = new BufferedReader(new InputStreamReader(System.in));
            st = new StringTokenizer("");
            out = new PrintWriter(System.out);
            solve();
            out.flush();
        }

        void solve() throws IOException {
            int height = nextInt();
            int width = nextInt();
            char[][] grid = new char[height][width];
            long[][] dp = new long[height][width];
            
            for(int row = 0; row < height; row++) {
                String line = next();
                for(int col = 0; col < width; col++) {
                    grid[row][col] = line.charAt(col);
                }
            }

            int md = (int)(1e9+7);
            dp[0][0] = 1l;
            
            for(int row = 0; row < height; row++) {
                for(int col = 0; col < width; col++) {
                    if(row == 0 && col == 0) continue;
                    long value = 0l;
                    if(grid[row][col] == '.') {
                        value += row - 1 < 0 ? 0l : dp[row - 1][col];
                        if(value >= md) {
                            value -= md;
                        }
                        value += col - 1 < 0 ? 0l : dp[row][col - 1];
                        if(value >= md) {
                            value -= md;
                        }
                    }
                    dp[row][col] = value;
                }
            }

            out.print(dp[height - 1][width - 1]);
            out.print("\n");
        }
    }
}

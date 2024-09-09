import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Template {
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
            long a = nextLong();
            long b = nextLong();
            out.print(a + b);
            out.print(" ");
            out.println(a - b);
        }
    }
}

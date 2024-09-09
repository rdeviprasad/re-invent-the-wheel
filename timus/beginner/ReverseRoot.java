import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseRoot {
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
            List<Long> numbers = new ArrayList<>();
            while(in.nextToken() != StreamTokenizer.TT_EOF) {
                numbers.add((long)in.nval);
            }
            Collections.reverse(numbers);
            for(long number : numbers) {
                out.print(squareRoot(number));
                out.print("\n");
            }
        }

        String squareRoot(long number) {
            return String.format("%.4f", Math.sqrt((double)number));
        }
    }
}

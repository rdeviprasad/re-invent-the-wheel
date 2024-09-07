import java.io.*;
import java.util.*;

public class Template {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int i1 = Integer.parseInt(st.nextToken());
            int i2 = Integer.parseInt(st.nextToken());
            writer.println(i1+i2);
            writer.close();
        } catch(Exception e) {
            System.out.println("Exception" + e);
        }
    } 
}

package template;

import java.io.BufferedReader;
// import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    static class Task {

        public Task() {
        }

        public void  Solve(int forTest,InputReader in, PrintWriter out) {

            int n;
            if(forTest>0){
                while(true)
                {
                    try {
                        n = in.nextInt();
                        if (n <= 3)
                            out.println("NO");
                        else {
                        if (n % 2 == 0)
                            out.println("YES");
                        else
                            out.println("NO");
                    }
                    } catch (Exception e) {
                        //TODO: handle exception
                       // out.close();
                        throw e;
                    }
                    
                }
            }else{
                n = in.nextInt();
                if (n <= 3)
                    out.println("NO");
                else {
                    if (n % 2 == 0)
                        out.println("YES");
                    else
                        out.println("NO");
                }
            }
            
            
        }

    }

    public static void main(String[] args) throws Exception {

        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Task task = new Task();
        task.Solve(0,in, out);

        out.close();

        
        
    }

     static class InputReader {

        public static BufferedReader reader;
        public static StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public static String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        static int nextInt() {
            return Integer.parseInt(next());
        }

        static long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        static double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        static char nextChar() throws IOException {
            return next().charAt(0);
        }

        static String nextLine() throws IOException {
            return reader.readLine().trim();
        }

    }

}
package he.pract.motupatlu;

/* package Example
package cf.pract.cf272c;
*/

import java.io.BufferedReader;
// import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/// Partially SOLVED

public class Main {

    static class Task {

        public Task() {
        }

        public void Solve(int forTest, InputReader in, PrintWriter out) throws Exception {

            while (true) {
                try {
                    // Solve the problem
                    int t, n;
                    long arr[] = new long[100005];

                    t = in.nextInt();
                    while (t-- > 0) {
                        n = in.nextInt();
                        long sum = 0;
                        for (int i = 0; i < n; i++) {
                            arr[i] = in.nextLong();
                            sum += arr[i];
                        }
                        long motu = sum * 2 / 3;
                        int j = 0, countmotu = 0;
                        while (motu > 0 && j<n) {
                            if (motu - arr[j] >= 0) {
                                motu -= arr[j];
                                countmotu++;
                            } else {
                                break;
                            }
                            j++;
                        }

                        long patlu = sum  / 3;
                        int  countpatlu = 0;
                        j = n-1;
                        while (patlu > 0 && j>=0) {
                            if (patlu - arr[j] >= 0) {
                                patlu -= arr[j];
                                countpatlu++;
                            } else {
                                break;
                            }
                            j--;
                        }
                        if(countmotu+countpatlu<n){
                            if(countmotu==0){
                                countmotu++;
                            }else if(countpatlu==0){
                                countpatlu++;
                            }else{
                                if(patlu*2<=motu)
                                countmotu++;
                                else {
                                    countpatlu++;
                                }
                            }
                        }
                        out.println(countmotu+" "+countpatlu);
                        if (countpatlu > countmotu) {
                            out.println("Patlu");
                        } else {
                            out.println("Motu");
                        }

                    }

                } catch (Exception e) {

                    if (forTest > 0) {
                        throw e;
                    } else {
                        break;
                    }
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
        try {
            task.Solve(0, in, out);
        } finally {
            out.close();
        }

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
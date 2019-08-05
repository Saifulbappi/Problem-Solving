package he.pract.saulgoodmansproblemstatement;

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
import java.util.Arrays;
import java.util.StringTokenizer;
 
/// PARTIALLY SOLVED
 
public class Main {
 
    static class Task {
 
        public Task() {
        }
 
        long countofPairs(long n){
            return (n*(n-1))/2;
        }
 
        public void  Solve(int forTest,InputReader in, PrintWriter out) throws Exception {
 
           
 
                while(true)
                {
                    try {
                        // Solve the problem
                        int n;
                        int t;
                        t = in.nextInt();
                        
                        int arrlen = (int)1e6;
                        while(t>0){
                            n = in.nextInt();
                            int leftdiag[] = new int[2*arrlen+5];
                            int rightdiag[] = new int[2*arrlen+5];
                            Arrays.fill(leftdiag, 0);
                            Arrays.fill(rightdiag, 0);
                            int truex,truey;
                            for (int i = 0; i < n; i++) {
                                truex = in.nextInt();
                                truey = in.nextInt();
                                leftdiag[truex+truey-1]++;
                                rightdiag[truex+arrlen-truey]++;
                            }
                            long res = 0;
                            for (int i = 1; i <= arrlen; i++) {
                                res += countofPairs(leftdiag[i])+countofPairs(rightdiag[i]);
                            }
                            out.println(res);
 
 
                        }
                        
 
                    }
                    catch (Exception e) {
                        
                        if(forTest>0){
                            throw e;
                        }else{
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
        try{
            task.Solve(0,in, out);
        }
        finally{
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
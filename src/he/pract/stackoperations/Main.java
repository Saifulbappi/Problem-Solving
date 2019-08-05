package he.pract.stackoperations;

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

/// SOLVED

public class Main {

    static class Task {

        public Task() {
        }

        public void  Solve(int forTest,InputReader in, PrintWriter out) throws Exception {

           

                while(true)
                {
                    try {
                        // Solve the problem
                        int n;
                        long k;

                        n = in.nextInt();
                        k = in.nextLong();
                        long arr[] = new long[n+2];

                        

                        long maxFound = -1;
                        for (int i = 0; i < n; i++) {
                            arr[i] = in.nextLong();
                            maxFound = Math.max(arr[i], maxFound);
                        }

                        if(n==1){
                            if(k%2==0)out.println(arr[0]);
                            else out.println(-1);
                            
                        }else{
                            if(k>n){
                                out.println(maxFound);
                            }else{
                                 maxFound = -1;
                                 for (int i = 0; i < k-1; i++) {
                                    maxFound = Math.max(maxFound, arr[i]);
                                 }
                                 if(n==k)out.println(maxFound);
                                 else{
                                    out.println(Math.max(maxFound, arr[(int)k]));
                                 }
                                 
                            }
                            
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
package he.pract.capitalofhills;

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
import java.util.Stack;
import java.util.StringTokenizer;

/// NOT SOLVED ////

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
                        n = in.nextInt();

                        
                        long arr[] =new long[n+5];

                        for (int i = 0; i < n; i++) {
                                arr[i] = in.nextLong();

                        }
                        
                        int pairCount = 0;
                        int pattern = -1;
                        for (int i = 1; i < n-1; i++) {

                            if(arr[i-1]> arr[i] && arr[i]<arr[i+1]){
                                pairCount++;
                                pattern = 3;
                            }
                            else if(arr[i-1]< arr[i] && arr[i]> arr[i+1]){
                                pairCount++;
                                pattern = 4;
                            }
                            else if(arr[i-1]< arr[i] && arr[i]< arr[i+1]){
                                pattern = 2;
                                pairCount++;
                            }
                            else if(arr[i-1]> arr[i] && arr[i]> arr[i+1]){
                                pattern = 1;
                                pairCount++;
                            }
                            else {
                                pattern = 0;
                            }
                            
                            
                        }
                        if(pattern>=3){
                            pairCount++;
                        }else if(pattern>0 && pattern<=2 && n>3){
                            pairCount++;
                        }
                        if(pairCount==0)pairCount++;
                        out.println(pairCount);
                        

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
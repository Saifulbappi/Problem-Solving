package he.pract.nearestsmallerelement;

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
import java.sql.Array;
import java.util.Arrays;
import java.util.Stack;
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
                        
                        int n = in.nextInt();

                        int arr[ ] = new int[n+2];
                        int ind[ ] = new int[n+2];
                        for (int i = 0; i < n; i++) {
                            arr[i] =in.nextInt();

                        }
                        Stack<Integer> st = new Stack<Integer>();

                        st.push(0);
                        Arrays.fill(ind, -1);
                        

                        for (int i = 1; i < n; i++) {

                            while(!st.empty() && arr[st.peek()] >= arr[i]){
                                st.pop();
                            }
                            if(st.empty())ind[i] = -1;
                            else ind[i] = arr[st.peek()];


                            st.push(i);

                        }
                        for(int i=0;i<n-1;i++){
                            out.print(ind[i]+" ");
                        }
                        out.println(ind[n-1]);



                        

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
package he.pract.priorityinterview;

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
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

/// SOLVED

public class Main {

    static class Task {

        class Pair{
            int first;
            long second;
            public Pair (int first, long second){
                this.first = first;
                this.second = second;
            }
        }

        public Task() {
        }

        public void  Solve(int forTest,InputReader in, PrintWriter out) throws Exception {

           

                while(true)
                {
                    try {
                        // Solve the problem
                        
                        int n;
                        n = in.nextInt();
                        Pair arr[] = new Pair[n];
                        for (int i = 0; i < n; i++) {
                            Pair val = new Pair(in.nextInt(), in.nextLong());
                            arr[i] = val;
                        }
                        
                        Arrays.sort(arr, new Comparator<Pair>() {
                            public int compare(Pair o2, Pair o1)
                            {

                
                                if(o1.first  > 0 && o2.first>0){
                                    
                                    if(o1.second> o2.second)return 1;
                                    else return -1;
                                }else if(o1.first  == 0 && o2.first>0){
                                    return 1;
                                }else if(o1.first  > 0 && o2.first==0){
                                    return -1;
                                }else{
                                    if(o1.second> o2.second)return 1;
                                    else return -1;
                                }
                
                                
                            }
                        });
                        for (int i = 0; i < n-1; i++) {
                            out.print(arr[i].second+" ");
                        }
                        out.println(arr[n-1].second);


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
package cf.pract.cf701a;

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
import java.util.*;

/// SOLVED

public class Main {

    static class Task {

        public Task() {
        }

        public void  Solve(int forTest,InputReader in, PrintWriter out) throws Exception {


                class pair{
                    int first,second;

                    pair(int first, int second){
                        this.first = first;
                        this.second = second;
                    }


                }

                while(true)
                {
                    try {
                        // Solve the problem
                        int  n = in.nextInt();

                        ArrayList<pair> arr = new ArrayList<pair>(n+5);


                        for (int i = 0; i < n; i++) {
                            pair p = new pair(in.nextInt(),i);
                            arr.add(p);
                        }

                        Collections.sort(arr, new Comparator<pair>() {
                            @Override
                            public int compare(pair o1, pair o2) {
                                if(o1.first>o2.first)return 1;
                                else if(o1.first==o2.first)return 0;
                                return -1;
                            }
                        });

                        for (int i=0; i<n/2;i++){
                            out.println(arr.get(i).second+1+" "+(arr.get(n-1-i).second+1));
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
package cf.pract.cf879b;

import java.io.BufferedReader;
// import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

/// SOLVED ///

public class Main {

    

    static class Task {


        public Task() {
        }

        public void  Solve(int forTest,InputReader in, PrintWriter out) throws Exception {

           
            //if(forTest>0)
            {

                while(true)
                {
                    try {
                        long  n,k;
                        long arr[] = new long[505];

                        n = in.nextLong();
                        k = in.nextLong();

                        for (int i = 0; i < n; i++) {
                            arr[i] = in.nextLong();
                        }
                        long res = arr[0];
                        long sofar = 0;
                        for (int i = 1; i < n; i++) {
                            if(arr[i]>res){
                                res = arr[i];
                                sofar = 1;
                            }else{
                                sofar++;
                                if(sofar==k)break;
                            }
                        }
                        out.println(res);

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
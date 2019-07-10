package cf.pract.cf272c;

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
                        int arr[] = new int[(int) (1e5 + 4)];
                        int n = in.nextInt();
                        for (int i = 0; i < n ; i++) {
                            arr[i] = in.nextInt();
                        }
                        int m = in.nextInt();
                        int wi[] = new int[(int)(1e5+4)];
                        long hi[] = new long[(int)(1e5+4)];

                        for (int i = 0; i < m; i++) {
                            wi[i] = in.nextInt();
                            hi[i] = in.nextLong();
                        }
                        long maxSofar = 1;

                        for (int i = 0; i < m; i++) {

                            long posHeight = Math.max(arr[wi[i]-1],maxSofar);
                            out.println(posHeight);
                            posHeight = posHeight + hi[i];
                            maxSofar = posHeight;
                            
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
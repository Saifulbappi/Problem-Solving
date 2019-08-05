package he.pract.anothermaximumproblem;

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
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

import javax.swing.Painter;

/// NOT SOLVED

public class Main {


     

    static class Task {

        class Pair{
            long first,second;
            public Pair(long first,long second){
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
                        int n,t;
                        n = in.nextInt();
                        
                        long a[] = new long[n];
                        HashMap<Long,Pair> hmpres = new HashMap<Long,Pair>();
                        
                        for (int i = 0; i < n; i++) {
                            a[i] = in.nextLong();

                        }

                        int leftind[] = new int[n];
                        int rightind[] = new int[n]; 
                        
                        Stack<Integer>st = new Stack<Integer>();
                        st.push(0);
                        leftind[0] = 0;

                        for (int i = 1; i < n; i++) {
                            leftind[i] = i;
                            while(!st.empty() && a[st.peek()]<=a[i]){
                                leftind[i] = leftind[st.peek()];
                                st.pop();
                                
                            }
                            st.push(i);

                        }
                        st.clear();
                        st.push(n-1);
                        rightind[n-1] = n-1;

                        for (int i = n-2; i >=0; i--) {
                            rightind[i] = i;
                            while(!st.empty() && a[st.peek()]<=a[i]){
                                rightind[i] = rightind[st.peek()];
                                st.pop();
                                
                            }
                            st.push(i);

                        }

                        for (int i = 0; i < n; i++) {
                            long left = i - leftind[i];
                            long right = rightind[i] - i;
                            long res;
                            res = (left* right) + left + right +1;
                            
                            
                           
                            
                            
                            if(hmpres.get(a[i])==null){
                                hmpres.put(a[i], new Pair(res, i));
                            }else{
                                if(hmpres.get(a[i]).second>=leftind[i]){
                                    hmpres.put(a[i], new Pair(hmpres.get(a[i]).first+1, i));
                                }else{
                                    hmpres.put(a[i], new Pair(hmpres.get(a[i]).first+res, i));
                                }
                                
                            }

                        }
                        

    

                        
                        t = in.nextInt();

                        while(t>0){
                            long x = in.nextLong();
                            t--;
                            out.println(hmpres.get(x).first);
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
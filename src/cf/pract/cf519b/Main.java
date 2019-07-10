package cf.pract.cf519b;

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


        public class CompileError{

            int value;
            int mark;
            public CompileError(int val, int markVal){
                this.value = val;
                this.mark = markVal;
            }
    
        }
        public class ValueComparator implements Comparator<CompileError>{

            @Override
            public int compare(CompileError e1, CompileError e2){

                if(e1.value<e2.value)
                return 1;
                return -1;

            } 

        }


        public Task() {
        }

        public void  Solve(int forTest,InputReader in, PrintWriter out) {

           
            //if(forTest>0)
            {

                while(true)
                {
                    try {
                        // Solve the problem
                        int n;
                        //int inarr[] =  new int[100000+6];
                        ArrayList<Integer> arr1 = new ArrayList<Integer>();
                        ArrayList<Integer> arr2 = new ArrayList<Integer>();
                        ArrayList<Integer> arr3 = new ArrayList<Integer>();
                        n   =   in.nextInt();

                        for (int i = 0; i < n ; i++) {
                            arr1.add(in.nextInt());
                        }
                        for (int i = 0; i < n-1; i++) {
                            arr2.add(in.nextInt());
                        }
                        for (int i = 0; i < n-2; i++) {
                            arr3.add(in.nextInt());
                        }
                        Collections.sort(arr1);
                        Collections.sort(arr2);
                        Collections.sort(arr3);
                    
                        int i,j;
                        int res0,res1,resi=-1,resj=-1;
                        res0=res1=0;
    
                        for ( i = 0,j = 0; i < n && j<n-1; i++) {
                            if(arr1.get(i).intValue()==arr2.get(j).intValue())
                            {   
                                j++;
                            }
                            else{
                                res0 = arr1.get(i).intValue();
                                resi = i;
                            }
                        }
                        if(resi==-1){
                            resi = i;
                            res0 = arr1.get(i).intValue();
                        }
                        for ( i = 0,j = 0; i < n && j<n-2; i++) {
                            if(arr1.get(i).intValue()==arr3.get(j).intValue())j++;
                            else{
                                if(i!=resi){
                                    res1 = arr1.get(i);
                                    resj = i;
                                }
                                
                            }
                        }
                        if(resj==-1){
                            if(i==resi)resj = i+1;
                            else resj = i;
                            res1 = arr1.get(resj);
                        }
                        out.println(res0);
                        out.println(res1);

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
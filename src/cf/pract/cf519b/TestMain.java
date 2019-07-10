package cf.pract.cf519b;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import org.junit.Test;

import cf.pract.cf519b.Main.InputReader;
import cf.pract.cf519b.Main.Task;



public class TestMain {

    final String dir = System.getProperty("user.dir")+"/src/"+"cf/pract/cf519b/";
        
    @Test
    public void testTask() throws Exception{

        InputStream inputStream = new FileInputStream(dir+"in.txt");
        OutputStream outputStream = new FileOutputStream(dir+"out.txt");
        //InputReader in = new InputReader(inputStream);
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Task task = new Task();
        try {
            task.Solve(1,in, out);
        } catch (Exception e) {
           // throw e;
            
        }finally{
            out.close();
        inputStream.close();
        outputStream.close();
        
        }
        //assertEquals(1, 1);
        verifyOut();
        
    }
    public void verifyOut()throws Exception{
        InputStream solvedOutputStream = new FileInputStream(dir+"out.txt");
        BufferedReader solvedReader  = new BufferedReader(new InputStreamReader(solvedOutputStream), 32768);;

        InputStream expectedOutputStream = new FileInputStream(dir+"exp.txt");
        BufferedReader expectedReader  = new BufferedReader(new InputStreamReader(expectedOutputStream), 32768);;

        InputStream inputStream = new FileInputStream(dir+"in.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(inputStream), 32768);

        String expected;
        String solved;
        String testCaseIn;
        int testcase = 0;
        try{

            while(
                ((expected = expectedReader.readLine()) !=null && expected.length()>0)
                && ((solved = solvedReader.readLine()) !=null && solved.length()>0)
                //&& ((testCaseIn = in.readLine()) !=null && testCaseIn.length()>0)
            ){
                assertEquals("test case "+(++testcase)+" ",expected, solved);
    
            }
        }finally{
            solvedReader.close();
            in.close();
            expectedReader.close();
        }
        
       


    }


}
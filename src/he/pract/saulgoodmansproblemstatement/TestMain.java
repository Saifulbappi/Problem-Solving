
/* package Example
package cf.pract.cf272c;
*/


package he.pract.saulgoodmansproblemstatement;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

import org.junit.Test;

import he.pract.saulgoodmansproblemstatement.Main.InputReader;
import he.pract.saulgoodmansproblemstatement.Main.Task;

/* Example 
import cf.pract.cf272c.Main.InputReader;
import cf.pract.cf272c.Main.Task;
*/





public class TestMain {

    final String dir = System.getProperty("user.dir")+"/src/"+"he/pract/saulgoodmansproblemstatement/";
    //Example final String dir = System.getProperty("user.dir")+"/src/"+"cf/pract/cf272c/";
    int perTestCaseOutPutLine = 1;
        
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
            if(!(e instanceof NullPointerException)){
                throw e;
            }
            
            
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
        int outputLine = 0;
        try{

            while(
                ((expected = expectedReader.readLine()) !=null && expected.length()>0)
            ){
                outputLine++;
                if(outputLine==perTestCaseOutPutLine){
                    outputLine = 0;
                    ++testcase;
                }
                if((solved = solvedReader.readLine()) !=null && solved.length()>0){

                    assertEquals("test case "+testcase+" ",expected, solved);
                }else{
                    
                    assertEquals("OutputNotFound for test case =>"+testcase, expected,"");
                }
                
    
            }
        }finally{
            solvedReader.close();
            in.close();
            expectedReader.close();
        }
        
       


    }


}
package app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
    }

    @Test
    public void testTest(){

        testAdd();
    }

    @Test
    public void testAdd() {
        
        assertEquals("vadaimma",2,2);
        assertEquals("tui vadaimma",1,2);
       
    }
   
}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingproblems;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author klove
 */
public class CodingProblems {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        ThreadsAndLocks threadExample = new ThreadsAndLocks();
        Thread thread = new Thread(threadExample);
        thread.start();
        
        /* Waits until above thread counts to 5 (slowly) */
        while (threadExample.count != 5)
        {
            try {
                Thread.sleep(250);
                
            }catch (InterruptedException exc)
            {
                exc.printStackTrace();
            }
        }
        
    }
    
}

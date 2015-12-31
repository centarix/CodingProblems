/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingproblems;

/**
 *
 * @author klove
 */
public class ThreadsAndLocks implements Runnable {
    int count = 0;
    
    public void run() {
        System.out.println("RunnableThread starting.");
        try {
            while(count < 5) {
                Thread.sleep(500);
                count++;
            }
        }
        catch(InterruptedException exc)
        {
            System.out.println("RunnableThread terminating.");
        }
        System.out.println("RunnableThread terminating.");
    }
}

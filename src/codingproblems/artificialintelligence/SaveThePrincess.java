/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingproblems.artificialintelligence;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/**
 *
 * @author klove
 */
public class SaveThePrincess {
    static int princessX;
    static int princessY;
    
    static void displayPathtoPrincess(int n, String [][] grid){
    //Top left corner
    int x1 = 0;
    int y1 = 0;
    //Bottom left corner
    int x2 = 0;
    int y2 = n - 1;
    //Bottom right corner
    int x3 = n - 1;
    int y3 = n - 1;
    //Top right corner
    int x4 = n - 1;
    int y4 = 0;
    
    int initX;
    int initY;
    

  
    
    for(int t = 0; t < grid.length; t++)
    {
        for(int s = 0; s < grid.length; s++)    
        {
            if("m".equals(grid[t][s]))
            {
                System.out.println("Initial position of m is: " + t + " " + s); 
                initX = t;
                initY = s;
            }
            
            if("p".equals(grid[t][s]))
            {
                princessX = t;
                princessY = s;
            }
        }
    }
    
    
    
  }
    
    static String[][] moveLeft(String[][] grid, int curX, int curY)
    {
        grid[curX][curY] = "-";
        grid[curX-1][curY] = "m";
        System.out.println("Move Left");
        return grid;
    }
    
    static String[][] moveRight(String[][] grid, int curX, int curY)
    {
        grid[curX][curY] = "-";
        grid[curX+1][curY] = "m";
        System.out.println("Move Right");
        return grid;
    }
    
    static String[][] moveUp(String[][] grid, int curX, int curY)
    {
        grid[curX][curY] = "-";
        grid[curX][curY-1] = "m";
        System.out.println("Move Up");
        return grid;
    }
        
    static String[][] moveDown(String[][] grid, int curX, int curY)
    {
        grid[curX][curY] = "-";
        grid[curX][curY+1] = "m";
        System.out.println("Move Down");
        return grid;
    }
    
    static void TravelToTopLeft(String[][] grid, int curX, int curY)
    {
        
    }
    
    static boolean isPrincessHere(int curX, int curY)
    {
        if(curX == princessX && curY == princessY)
        {
            return true;
        }
        return false;
    }
}

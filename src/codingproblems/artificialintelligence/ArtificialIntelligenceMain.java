/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingproblems.artificialintelligence;

/**
 *
 * @author klove
 */
public class ArtificialIntelligenceMain {
    public static void main(String[] args)
    {
        SaveThePrincess saveHer = new SaveThePrincess();
        int m = 3;
        String grid[][] = {{"-", "-", "-"},
                           {"-", "m", "-"},
                           {"p", "-", "-"}};
        saveHer.displayPathtoPrincess(m,grid);
    }
}

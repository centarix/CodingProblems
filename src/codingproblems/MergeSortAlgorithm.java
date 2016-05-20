/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingproblems;

/**
 *
 * @author kcor
 */
public class MergeSortAlgorithm {
    
    public void mergesort(int[] array) {
        int[] helper = new int[array.length];
        mergesort(array, helper, 0, array.length - 1);
    }
    
    void mergesort(int[] array, int[] helper, int low, int high) {
        if(low < high) {
            
        }
    }
    
    void merge(int[] array, int[] helper, int low, int middle, int high) {
        /*Copy both halves into a helper array */
        for (int i = low; i <= high; i++) {
            helper[i] = array[i];
        }
        
        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;
        
        /*
            Iterate through helper array. Compare the left and right half, copying back
            the smaller element from the two halves into the original array. */
        while(helperLeft <= middle && helperRight <= high) {
            if(helper[helperLeft] <= helper[helperRight]) {
                
            }
        }
    }
    
}

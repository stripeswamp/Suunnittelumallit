/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stripeswamp
 */
public class Context {
    private SortStrategy sortStrategy;
    
    public Context(SortStrategy option)
    {
        this.sortStrategy = option;
    }
    
    public void executeStrategy(int[] inputArray)
    {
        this.sortStrategy.sort(inputArray);
    }
}

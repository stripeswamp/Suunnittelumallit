public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = { 5,2,6,4,1,6,7 };
        
        Context context = new Context(new BubbleSort());
        context.executeStrategy(array);
        
        System.out.println("");
        
        context = new Context(new SelectionSort());
        context.executeStrategy(array);
        
        System.out.println("");
        
        context = new Context(new InsertionSort());
        context.executeStrategy(array);
    }
    
}

/**
 *
 * @author stripeswamp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PokemonControl player = new PokemonControl();
        Visitor visitor = new ConcreteVisitor();
        
        player.accept(visitor);
        System.out.println(player);
        System.out.println(player.getPoints());
        player.addPoints(20);
        System.out.println(player.getPoints());
        
        player.accept(visitor);
        player.setPokemonState(player.nextState());
        System.out.println(player);
        System.out.println(player.getPoints());
        player.addPoints(20);
        System.out.println(player.getPoints());
        
        player.accept(visitor);
        player.setPokemonState(player.nextState());
        System.out.println(player);
        System.out.println(player.getPoints());
        player.addPoints(20);
        System.out.println(player.getPoints());
        
        
    }
    
}

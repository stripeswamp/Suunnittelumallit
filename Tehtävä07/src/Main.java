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
        System.out.println("I am " + player + "!");
        
        player.kick();
        player.jump();
        player.punch();
        
        System.out.println("---");
        
        player.setPokemonState(new Charmeleon());
        
        System.out.println("I am " + player + "!");
        
        player.kick();
        player.jump();
        player.punch();
        
        System.out.println("---");
        
        player.setPokemonState(new Charizard());
        
        System.out.println("I am " + player + "!");
        
        player.kick();
        player.jump();
        player.punch();
    }
    
}

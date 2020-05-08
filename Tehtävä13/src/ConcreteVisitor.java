public class ConcreteVisitor implements Visitor {
    
    @Override
    public void visit(Charmander pokemonState)
    {
        pokemonState.addPoints(10);
    }
    
    @Override
    public void visit(Charmeleon pokemonState)
    {
        pokemonState.addPoints(20);
    }
    
    @Override
    public void visit(Charizard pokemonState)
    {
        pokemonState.addPoints(30);
    }
}

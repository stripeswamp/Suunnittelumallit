public class Charmander implements PokemonState{
   
    private java.util.Random random;
    private int points;
    private int bonus;
    
    public Charmander()
    {
        this.random = new java.util.Random();
        this.points = 0;
        this.bonus = random.nextInt(5 - 1) + 1;
    }
       
    @Override
    public void kick()
    {
        System.out.println("Single kick!");
    }

    @Override
    public void jump()
    {
        System.out.println("Jump 1m high!");
    }

    @Override
    public void punch()
    {
        System.out.println("Single punch!");
    }
    
    @Override
    public String toString()
    {
        return this.getClass().getSimpleName();
    }
    
    @Override
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
   
    @Override
    public PokemonState nextState()
    {
        return new Charmeleon();
    }
    
    @Override
    public void addPoints(int input)
    {
        this.points += input + bonus;
    }
    
    @Override
    public int getPoints()
    {
        return this.points;
    }
}

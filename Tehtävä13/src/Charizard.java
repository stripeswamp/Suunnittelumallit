public class Charizard implements PokemonState {
   
    private java.util.Random random;
    private int points;
    private int bonus;
    
    public Charizard()
    {
        this.random = new java.util.Random();
        this.points = 0;
        this.bonus = random.nextInt(10 - 5) + 1;
    }
    
   @Override
   public void kick()
   {
       System.out.println("Triple kick!");
   }
   
   @Override
   public void jump()
   {
       System.out.println("Jump 3m high!");
   }
   
   @Override
   public void punch()
   {
       System.out.println("Triple punch!");
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
        return null;
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

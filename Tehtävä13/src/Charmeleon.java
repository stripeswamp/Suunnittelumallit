public class Charmeleon implements PokemonState {
    
    private java.util.Random random;
    private int points;
    private int bonus;
    
    public Charmeleon()
    {
        this.random = new java.util.Random();
        this.points = 0;
        this.bonus = random.nextInt(8 - 3) + 1;
    }
    
    @Override
    public void kick()
    {
        System.out.println("Double kick!");
    }

    @Override
    public void jump()
    {
        System.out.println("Jump 2m high!");
    }

    @Override
    public void punch()
    {
        System.out.println("Double punch!");
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
        return new Charizard();
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

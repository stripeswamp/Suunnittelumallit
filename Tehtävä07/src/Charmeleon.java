/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stripeswamp
 */
public class Charmeleon implements PokemonState {
    
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
}

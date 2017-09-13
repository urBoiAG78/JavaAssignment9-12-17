/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalraces;

/**
 *
 * @author agonzalez
 */
public class Lion extends Mammal implements IWalk, ISwim, IMakeSound, IFly{
    public String lName = Name = "Simba";
    public int lTemp = bodyTemp = 152;
    
    @Override
    public void Walk() {
        System.out.println("I can walk");
    }

    @Override
    public void Swim() {
        System.out.println("I can swim");
    }

    @Override
    public void makeSound() {
        System.out.println("I go ROAR");
    }

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}

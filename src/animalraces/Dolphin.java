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
public class Dolphin extends Mammal implements IWalk, ISwim, IMakeSound, IFly{

    public String dName = Name = "Dolphindeer";
    public int dTemp = bodyTemp = 92;
    
    @Override
    public void Walk() {
        System.out.println("I can't walk");
    }

    @Override
    public void Swim() {
        System.out.println("I can swim");
    }

    @Override
    public void makeSound() {
        System.out.println("I go EEEEHHHHEEHHE");
    }

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}

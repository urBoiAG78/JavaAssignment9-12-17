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
public class Ostrich extends Bird implements IWalk, ISwim, IMakeSound, IFly{
    
    public String oName = bName = "Oliver the Ostrich";
    public int oWing = WingSpan = 14;
    
    
    @Override
    public void Walk() {
        System.out.println("I can Walk");
    }

    @Override
    public void Swim() {
        System.out.println("I can swim");
    }

    @Override
    public void makeSound() {
        System.out.println("I go AAAAAHHAHAHAHAHHAHAHAHAH");
    }

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

    
    
        
    
    
}

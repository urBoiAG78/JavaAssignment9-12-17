/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalraces;

import java.util.ArrayList;

/**
 *
 * @author agonzalez
 */
public class AnimalRaces {

    /**
     * @param args the command line arguments  
     * shes, Flyers, Walkers, Swimmers, SoundMakers  
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       Eagle myEagle = new Eagle();
       Penguin myPenguin = new Penguin();
       Ostrich myOstrich = new Ostrich();
       
       Bass myBass = new Bass();
       Shark myShark = new Shark();
       FlyingFish myFlyingFish = new FlyingFish();
       
       Lion myLion = new Lion();
       Dolphin myDolphin = new Dolphin();
       Bat myBat = new Bat();
       
       ArrayList myAnimals = new ArrayList<>();
       myAnimals.add(myEagle);
       myAnimals.add(myPenguin);
       myAnimals.add(myOstrich);
       myAnimals.add(myBass);
       myAnimals.add(myShark);
       myAnimals.add(myFlyingFish);
       myAnimals.add(myLion);
       myAnimals.add(myDolphin);
       myAnimals.add(myBat);
       
       
       
       ArrayList myMammals = new ArrayList<>();
       myMammals.add(myLion);
       myMammals.add(myDolphin);
       myMammals.add(myBat);
       
       ArrayList myBirds = new ArrayList<>();
       myBirds.add(myEagle);
       myBirds.add(myPenguin);
       myBirds.add(myOstrich);
       //fishes, Flyers, Walkers, Swimmers, SoundMakers  
       ArrayList myFishs = new ArrayList<>();
       myFishs.add(myBass);
       myFishs.add(myShark);
       myFishs.add(myFlyingFish);
       
       ArrayList<IWalk> myWalkers = new ArrayList<>();
       myWalkers.add(myPenguin);
       myWalkers.add(myOstrich);
       myWalkers.add(myLion);
       
       for(IWalk walker: myWalkers)
       {
           System.out.println(walker.getClass());
       }
       
        System.out.println("---------------");
        
       ArrayList<IFly> myFlyers = new ArrayList<>();
       myFlyers.add(myEagle);
       myFlyers.add(myBat);
       myFlyers.add(myFlyingFish);
       
       for(IFly flyer: myFlyers)
       {
           System.out.println(flyer.getClass());
       }
       
       ArrayList<ISwim> mySwimmers = new ArrayList<>();
       mySwimmers.add(myFlyingFish);
       mySwimmers.add(myBass);
       mySwimmers.add(myShark);
       mySwimmers.add(myOstrich);
       mySwimmers.add(myLion);
       mySwimmers.add(myPenguin);
       mySwimmers.add(myDolphin);
       
       for(ISwim swimmer: mySwimmers)
       {
           
       }
       
       ArrayList<IMakeSound> mySoundMakers = new ArrayList<>();
       mySoundMakers.add(myEagle);
       mySoundMakers.add(myPenguin);
       mySoundMakers.add(myOstrich);
       mySoundMakers.add(myBass);
       mySoundMakers.add(myShark);
       mySoundMakers.add(myFlyingFish);
       mySoundMakers.add(myLion);
       mySoundMakers.add(myDolphin);
       mySoundMakers.add(myBat);
       
       
    }
    
}

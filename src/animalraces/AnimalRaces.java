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

    private static String name;

    /**
     * @param args the command line arguments  
     * shes, Flyers, Walkers, Swimmers, SoundMakers  
     */
    public static void main(String[] args) {
       // Creates the animals and thier names.
       Eagle myEagle = new Eagle();
       Penguin myPenguin = new Penguin();
       Ostrich myOstrich = new Ostrich();
       myEagle.Name = "Bob the Eagle";
       myPenguin.Name = "Pengu the Penguin";
       myOstrich.Name = "Oliver the Ostrich";
       
       Bass myBass = new Bass();
       Shark myShark = new Shark();
       FlyingFish myFlyingFish = new FlyingFish();
       myBass.Name = "Brady the Bass";
       myShark.Name = "Sid the Shark";
       myFlyingFish.Name = "Fry Teh Flying Fish";
       
       Lion myLion = new Lion();
       Dolphin myDolphin = new Dolphin();
       Bat myBat = new Bat();
       myLion.Name = "Simba";
       myDolphin.Name = "Dolphindeer";
       myBat.Name = "Ben the bat";
       
       ArrayList<Animals>myAnimals = new ArrayList<>();
       myAnimals.add(myEagle);
       myAnimals.add(myPenguin);
       myAnimals.add(myOstrich);
       myAnimals.add(myBass);
       myAnimals.add(myShark);
       myAnimals.add(myFlyingFish);
       myAnimals.add(myLion);
       myAnimals.add(myDolphin);
       myAnimals.add(myBat);
       
       System.out.println("---------------");
       System.out.println("These are the name of the animals");
       
       for(Animals animals: myAnimals)
       {
           System.out.println(animals.Name.toString());
       }
       
       ArrayList<Mammal> myMammals = new ArrayList<>();
       myMammals.add(myLion);
       myMammals.add(myDolphin);
       myMammals.add(myBat);
       
       System.out.println("---------------");
       System.out.println("These are the mammal's body temp");
       
       for(Mammal mammals: myMammals)
       {
           System.out.println(mammals.Name + "'s body temperature is " + mammals.bodyTemp + " degress Fahrenheit.");
       }
       
       System.out.println("---------------");
       System.out.println("These are the Bird's wing span");
       
       ArrayList<Bird> myBirds = new ArrayList<>();
       myBirds.add(myEagle);
       myBirds.add(myPenguin);
       myBirds.add(myOstrich);
       
       for (Bird birds: myBirds)
       {
           System.out.println(birds.Name + "'s wing span is " + birds.WingSpan + " feet");
       }
       
       System.out.println("---------------");
       System.out.println("These fish are either freshwater or saltwater");
       
       ArrayList<Fish>myFishs = new ArrayList<>();
       myFishs.add(myBass);
       myFishs.add(myShark);
       myFishs.add(myFlyingFish);
       
       for(Fish fish: myFishs)
       {
           if(fish.isSaltWater = true)
           {
               System.out.println(fish.Name + " is a saltwater fish");
           }
           else
           {
               System.out.println(fish.Name + " is a freshwater fish");
           }
       }
       
       ArrayList<IWalk> myWalkers = new ArrayList<>();
       myWalkers.add(myPenguin);
       myWalkers.add(myOstrich);
       myWalkers.add(myLion);
       
       System.out.println("---------------");
       System.out.println("These classes can walk");
       
       for(IWalk walker: myWalkers)
       {
           System.out.println(walker.getClass());
       }
       
       System.out.println("---------------");
       System.out.println("These classes can fly");
        
       ArrayList<IFly> myFlyers = new ArrayList<>();
       myFlyers.add(myEagle);
       myFlyers.add(myBat);
       myFlyers.add(myFlyingFish);
        
       for(IFly flyer: myFlyers)
       {
           System.out.println(flyer.getClass());
       }
       
       System.out.println("---------------");
       System.out.println("These classes can swim");
       
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
           System.out.println(swimmer.getClass());
       }
       
       System.out.println("---------------");
       System.out.println("There classes make sounds");
       
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
       
       for(IMakeSound sMaker: mySoundMakers)
       {
           System.out.println(sMaker.getClass());           
       }
       
    }
    
}

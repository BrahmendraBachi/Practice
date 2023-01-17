package oopsPractice.polymorphism;

import oopsPractice.encapsulation.CricketPlayer;

//PlayerSearchMethod2 is a class which extends A_CricketStatMethods and override the same methods
public class B_CricketStatMethods extends A_CricketStatMethods {

    @Override
    CricketPlayer myBestPlayer(){
        //Here this method gives the best player of B
        return null;
    }

}

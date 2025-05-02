package org.example.SOLID.lishkow_substitution_principle;

public class LiskovSubtitutionPrinciple {
    public static void main(String[] args) throws Exception{
        //Objects of a superclass should be replaceable with objects of its subclasses without affecting the correctness of the program.
        Creature human= new Human();
        Creature animal=new Animal();
        Creature bird=new Bird(); //bird cannot support run method so it is voilation of LSP
        human.run();
        animal.run();;
        bird.run();

    }
}

abstract  class Creature{
    abstract void run() throws Exception;

}

class Human extends  Creature{
    void run(){
        System.out.println("Human can run");

    }

}

class Animal extends  Creature{
    void run(){
        System.out.println("Animal can run");

    }

}

class Bird extends  Creature{
    void run() throws Exception {
        throw new Exception("cannot run");

    }

}



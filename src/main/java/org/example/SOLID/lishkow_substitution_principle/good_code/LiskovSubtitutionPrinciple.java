package org.example.SOLID.lishkow_substitution_principle.good_code;

public class LiskovSubtitutionPrinciple {
    public static void main(String[] args) throws Exception{
        //Objects of a superclass should be replaceable with objects of its subclasses without affecting the correctness of the program.
        Creature human= new Human();
        Creature animal=new Animal();
        BaseCreature bird=new Bird(); //bird cannot support run but it can breath now all superclass can replaced by parent class
        human.run();
        animal.run();;
        bird.breath();

    }
}

abstract  class BaseCreature{
    abstract void breath() ;

}

abstract  class Creature extends BaseCreature{
    abstract void run() throws Exception;

}

class Human extends  Creature{
    void run(){
        System.out.println("Human can run");

    }
    void breath()  {
        System.out.println("Bird can Breath");

    }


}

class Animal extends  Creature{
    void run(){
        System.out.println("Animal can run");

    }
    void breath()  {
        System.out.println("Bird can Breath");

    }

}

class Bird extends  BaseCreature{
    void breath()  {
        System.out.println("Bird can Breath");

    }

}



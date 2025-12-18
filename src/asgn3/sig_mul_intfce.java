package asgn3;

import java.util.*;
class animal{
    animal(){
        System.out.println("Animal cretad");
    }
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class dog extends animal{
    dog(){
        super();
        System.out.println("dog created");
    }
    @Override
    void sound(){
        System.out.println("dog barks");
    }
}

class puppy extends dog{
    puppy(){
        super();
        System.out.println("puppies 7");
    }
    @Override
    void sound(){
        System.out.println("puppy yaps");
    }
    void behaviour(){
        System.out.println("Puppy is innocent");
    }
}


public class sig_mul_intfce {
    public static void main(String[] args){
        System.out.println("--- Single inheritance and method Overriding ---");
        dog d = new dog();
        d.sound();
        System.out.println("\n--- Multilevel Inheritance");
        puppy p = new puppy();
        p.sound();
        p.behaviour();
    }
}

package com.company;

/**
 * Created by michaelplott on 9/20/16.
 */
public class Animal {
    String name;


    void makeSound() {
        System.out.println("GENERIC ANIMAL SOUND!");
    }

    @Override
    public String toString() {
        return name;
    }
}

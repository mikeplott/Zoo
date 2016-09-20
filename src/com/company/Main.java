package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Dog d = new Dog();
        Hawk h = new Hawk();
        Snake s = new Snake();

        d.makeSound();
        h.makeSound();
        s.makeSound();

        System.out.println(d);
        System.out.println(h);
        System.out.println(s);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type an animal name:");
        String name = scanner.nextLine();
        Animal a = createAnimal(name);
        System.out.println(a);
    }

    // factory method
    static Animal createAnimal(String name) {
        Animal animal;
        if (name.equalsIgnoreCase("dog")) {
            animal = new Dog();
        }
        else if (name.equalsIgnoreCase("hawk")) {
            animal = new Hawk();
        }
        else if (name.equalsIgnoreCase("sname")) {
            animal = new Snake();
        }
        else {
            animal = new Animal();
        }
        return animal;
    }
}

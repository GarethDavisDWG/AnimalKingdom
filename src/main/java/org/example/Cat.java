package org.example;

public class Cat extends Mammal{
    public String eat()
    {
        return(getName() + " eats");
    }
    public String kill(Animal animal)
    {
        System.out.println(animal.die());
        return(getName() + " kills " + animal.getName());
    }
}
package org.example;

public class Cat extends Mammal{
    public void setNameFirst(String name)
    {
        setName(name);
    }

    public void setAgeFirst(int age)
    {
        setAge(age);
    }

    public int setHealthFirst(int health)
    {
        return(health);
    }
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
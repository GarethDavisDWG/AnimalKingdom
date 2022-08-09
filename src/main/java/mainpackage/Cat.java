package mainpackage;

public class Cat extends Mammal{
    public void setNameFirst(String name)
    {
        setName(name);
    }

    public void setAgeFirst(int age)
    {
        setAge(age);
    }

    public void setHealthFirst(int health)
    {
        setHealth(health);
    }
    public String eat()
    {
        //amountEaten++;
        return(getName() + " eats");
    }
    public String kill(Animal animal)
    {
        //animalsKilled++;
        animal.die();
        return(getName() + " kills " + animal.getName());
    }
}
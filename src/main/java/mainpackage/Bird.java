package mainpackage;

public class Bird extends Animal{


    public String breathe()
    {
        return(this.getName() + " breathes");
    }

    public void breed(Animal animal1, Animal animal2)
    {
        System.out.println(animal1.getName() + " breeds with " + animal2.getName());
        flyingRatArray.add(new FlyingRat());
    }
}

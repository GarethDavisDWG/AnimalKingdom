package mainpackage;

public class Mammal extends Animal{

    public String breathe()
    {
        return(this.getName() + " breathes");
    }

    public void breed(Animal animal1, Animal animal2)
    {
        if(animal1.getClass() == animal2.getClass())
        {
            //if(animal1 instanceof Cat)
            //{
                System.out.println(animal1.getName() + " breeds with " + animal2.getName());
                catArray.add(new Cat());
            //}
        }
    }
}

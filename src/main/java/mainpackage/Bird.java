package mainpackage;

public class Bird extends Animal{


    public String breathe()
    {
        return(this.getName() + " breathes");
    }

    public void breed(Animal animal1, Animal animal2)
    {
        if(animal1.getClass() == animal2.getClass())
        {
            if(animal1 instanceof FlyingRat)
            {
                System.out.println(animal1.getName() + " breeds with " + animal2.getName());
                flyingRatArray.add(new FlyingRat());
            }
            else {

            }
        }
        else{

        }
    }
}

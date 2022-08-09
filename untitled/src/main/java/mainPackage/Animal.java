package mainPackage;

public class Animal extends Object{
    private String name;
    private int age, health;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String move(String location)
    {
        return(this.getName() + " moves to " + location);
    }
    public String sleep()
    {
        return(this.getName() + " sleeps");
    }
    public String poop()
    {
        return(this.getName() + " poops");
    }
    public String die()
    {
        if(this instanceof Cat) {
            catArray.remove(this);
        }
        else if (this instanceof FlyingRat)
        {
            flyingRatArray.remove(this);
        }
        System.out.println(this.getName() + " dies");
        return(this.getName() + " dies");
    }
}

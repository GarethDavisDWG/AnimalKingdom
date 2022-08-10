package org.example;

public class FlyingRat extends Bird implements Flying{
    private boolean isFlying;
    public boolean isFlying() {
        return isFlying;
    }

    public FlyingRat(String name, int age, int health)
    {
        setName(name);
        setAge(age);
        setHealth(health);
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    public String eat()
    {
        return(getName() + " eats");
    }

    @Override
    public String takeOff() {
        return (getName() + " takes off");
    }

    @Override
    public String flight() {
        isFlying = true;
        return (getName() + " is flying");
    }

    @Override
    public String landing() {
        isFlying = false;
        return (getName() + " has landed");
    }
}

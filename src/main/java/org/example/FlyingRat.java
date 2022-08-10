package org.example;

public class FlyingRat extends Bird implements Flying{
    private boolean isFlying;

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
       return (health);
    }
    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    public String eat()
    {
        return(getName() + " eats");
    }

    @Override
    public Boolean takeOff() {
        return (isFlying);
    }

    @Override
    public Boolean flight() {
        return (isFlying = true);
    }

    @Override
    public Boolean landing() {
        return (isFlying = false);
    }
}

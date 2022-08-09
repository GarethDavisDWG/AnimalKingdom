package mainpackage;

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

    public void setHealthFirst(int health)
    {
        setHealth(health);
    }
    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    public String eat()
    {
        //amountEaten++;
        return(getName() + " eats");
    }

    @Override
    public void takeOff() {
        isFlying = true;
    }

    @Override
    public void flight() {
//nothing to put here yet
    }

    @Override
    public void landing() {
//nothing to put here yet
    }
}

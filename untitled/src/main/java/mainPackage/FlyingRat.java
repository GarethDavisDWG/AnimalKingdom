package mainPackage;

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
    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    public String eat()
    {
        amountEaten++;
        return(getName() + " eats");
    }

    @Override
    public void takeOff() {
        isFlying = true;
    }

    @Override
    public void flight() {

    }

    @Override
    public void landing() {

    }
}

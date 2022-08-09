package mainPackage;

public class Animal extends Object{
    private String name;
    private int age;

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
    public String move()
    {
        return("The animal moves");
    }
    public String sleep()
    {
        return("The animal sleeps");
    }
    public String poop()
    {
        return("The animal poops");
    }
    public String die()
    {
        System.out.println("The animal dies");
        return("The animal dies");
    }
}

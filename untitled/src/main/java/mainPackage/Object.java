package mainPackage;
import java.util.ArrayList;
public class Object {

    public static ArrayList<FlyingRat> flyingRatArray = new ArrayList<FlyingRat>();
    static Cat cat = new Cat();
    public static int animalsKilled = 0, amountEaten = 0;

    public static void main(String[] args)
    {
        flyingRatArray.add(new FlyingRat());
        flyingRatArray.add(new FlyingRat());
        flyingRatArray.add(new FlyingRat());

        cat.setNameFirst("Bingo");
        cat.setAgeFirst(8);

        flyingRatArray.get(0).setNameFirst("Blungo");
        flyingRatArray.get(0).setAgeFirst(6);

        flyingRatArray.get(1).setNameFirst("Cungo");
        flyingRatArray.get(2).setNameFirst("Dungo");

        System.out.println(cat.eat());

        System.out.println(cat.move());

        System.out.println("");

        System.out.println(flyingRatArray.get(0).eat());
        flyingRatArray.get(0).takeOff();
        System.out.println(flyingRatArray.get(0).isFlying());
        System.out.println(flyingRatArray.get(0).move() + "\n");

        System.out.println("Amount eaten: " + amountEaten + "\n");

        for(int i = 0; i < flyingRatArray.size(); i++)
        {
            try {
                System.out.println(cat.kill(flyingRatArray.get(i)));
                //flyingRatArray.remove(i);
                System.out.println("Animals killed: " + animalsKilled);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

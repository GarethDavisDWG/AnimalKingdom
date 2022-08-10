package org.example;
import java.util.ArrayList;
import java.util.Random;
public class Main {

    static Random rand = new Random();
    protected static final ArrayList<Cat> catArray = new ArrayList<>();
    protected static final ArrayList<FlyingRat> flyingRatArray = new ArrayList<>();
    static int random;

    public static void main(String[] args)
    {
        for(int i = 0; i < 3; i++) {
            flyingRatArray.add(new FlyingRat());
        }
        for(int i = 0; i < 2; i++) {
            catArray.add(new Cat());
        }

        catArray.get(0).setNameFirst("Bingo");
        catArray.get(0).setHealth(catArray.get(0).setHealthFirst(100));
        catArray.get(1).setNameFirst("Bongo");

        flyingRatArray.get(0).setNameFirst("Blungo");
        flyingRatArray.get(0).setAgeFirst(6);

        flyingRatArray.get(1).setNameFirst("Cungo");
        flyingRatArray.get(1).setAgeFirst(5);

        flyingRatArray.get(2).setNameFirst("Dungo");
        flyingRatArray.get(2).setAgeFirst(8);

        //breeding
        System.out.println("Amount of cats: " + catArray.size());

        System.out.println(catArray.get(0).breed(catArray.get(0), catArray.get(1)));
        catArray.get(2).setNameFirst("Boingo");
        catArray.get(2).setAgeFirst(0);

        System.out.println(catArray.get(2).getName() + " now exists");

        System.out.println("Amount of cats: " + catArray.size() + "\n");

        //cat actions
        System.out.println(catArray.get(0).eat() + "\n");

        //bird actions
        System.out.println(flyingRatArray.get(0).eat());

        //cat killing
        for(int i = 0; i < flyingRatArray.size(); i++)
        {
            System.out.println(catArray.get(random = rand.nextInt(catArray.size())).move(flyingRatArray.get(i).getName()));

            System.out.println(catArray.get(random).kill(flyingRatArray.get(i--)) + "\n");
        }
        System.out.println("Amount of flying rats " + flyingRatArray.size());
    }
}

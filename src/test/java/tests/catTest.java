package tests;

import mainpackage.Cat;
import mainpackage.FlyingRat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class catTest {

    @Test
    public void test_get_cat_age()
    {
        Cat testCat = new Cat();

        assertEquals(0, testCat.getAge(), "this is not it");
    }

    @Test
    public void test_get_cat_eat()
    {
        Cat testCat = new Cat();
        assertEquals("null eats", testCat.eat(), "this is not it");
    }

    @Test
    public void test_get_cat_kill()
    {
        Cat testCat = new Cat();
        FlyingRat flyingRat = new FlyingRat();
        assertEquals("null kills null", testCat.kill(flyingRat), "this is not it");
    }

    @Test
    public void test_cat_name()
    {
        Cat testCat = new Cat();
        testCat.setNameFirst("big cat");
        assertEquals("big cat", testCat.getName(), "this is not it");
    }
}

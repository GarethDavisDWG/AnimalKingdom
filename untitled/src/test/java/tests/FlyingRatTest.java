package tests;

import mainPackage.Cat;
import mainPackage.FlyingRat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlyingRatTest {
    @Test
    public void test_flyingrat_eat()
    {
        FlyingRat flyingRat = new FlyingRat();

        assertEquals("The FlyingRat eats", flyingRat.eat(), "this is not it");
    }
}

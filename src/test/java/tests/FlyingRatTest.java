package tests;

import mainpackage.FlyingRat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class FlyingRatTest {
    @Test
     void test_flyingrat_eat()
    {
        FlyingRat flyingRat = new FlyingRat();

        assertEquals("null eats", flyingRat.eat(), "this is not it");
    }
}

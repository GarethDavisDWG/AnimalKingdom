package org.example.test;

import org.example.Cat;
import org.example.FlyingRat;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class FlyingRatTest {
    @Test
    void test_flyingrat_eat()
    {
        FlyingRat flyingRat = new FlyingRat();

        assertEquals("null eats", flyingRat.eat(), "this is not it");
    }

     @Test
     void test_flyingrat_name()
     {
         ArrayList<FlyingRat> flyingRatArray = new ArrayList<>();

         flyingRatArray.add(new FlyingRat());
         flyingRatArray.get(0).setNameFirst("big rat");
         assertEquals("big rat", flyingRatArray.get(0).getName(), "this is not it");
     }

     @Test
     void test_flyingrat_age()
     {
         ArrayList<FlyingRat> flyingRatArray = new ArrayList<>();

         flyingRatArray.add(new FlyingRat());

         assertEquals(0, flyingRatArray.get(0).getAge(), "this is not it");
     }

     @Test
     void test_flyingrat_get_health()
     {
         FlyingRat flyingRat = new FlyingRat();

         assertEquals(100, flyingRat.setHealthFirst(100), "this is not it");
     }

     @Test
     void test_flyingrat_is_flying()
     {
         FlyingRat flyingRat = new FlyingRat();

         assertEquals(false, flyingRat.isFlying(), "this is not it");
     }

     @Test
     void test_flyingrat_takeoff()
     {
         FlyingRat flyingRat = new FlyingRat();

         assertEquals(false, flyingRat.takeOff(), "this is not it");
     }

     @Test
     void test_flyingrat_flight()
     {
         FlyingRat flyingRat = new FlyingRat();

         assertEquals(true, flyingRat.flight(), "this is not it");
     }

     @Test
     void test_flyingrat_landing()
     {
         FlyingRat flyingRat = new FlyingRat();

         assertEquals(false, flyingRat.landing(), "this is not it");
     }
}

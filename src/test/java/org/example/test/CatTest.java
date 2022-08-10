package org.example.test;

import org.example.Cat;
import org.example.FlyingRat;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class CatTest {

    @Test
     void test_get_cat_age()
    {
        ArrayList<Cat> catArray = new ArrayList<>();

        catArray.add(new Cat());

        assertEquals(0, catArray.get(0).getAge(), "this is not it");
    }

    @Test
     void test_get_cat_eat()
    {
        Cat testCat = new Cat();
        assertEquals("null eats", testCat.eat(), "this is not it");
    }

    @Test
     void test_get_cat_kill()
    {
        Cat testCat = new Cat();
        FlyingRat flyingRat = new FlyingRat();
        assertEquals("null kills null", testCat.kill(flyingRat), "this is not it");
    }

    @Test
     void test_cat_name()
    {
        ArrayList<Cat> catArray = new ArrayList<>();

        catArray.add(new Cat());
        catArray.get(0).setNameFirst("big cat");
        assertEquals("big cat", catArray.get(0).getName(), "this is not it");
    }

     @Test
     void test_cat_breed()
     {
         Cat testCat = new Cat();
         Cat testCat2 = new Cat();

         assertEquals("null breeds with null", testCat.breed(testCat, testCat2), "this is not it");
     }

     @Test
     void test_cat_get_health()
     {
         Cat testCat = new Cat();

         assertEquals(100, testCat.setHealthFirst(100), "this is not it");
     }

     @Test
     void test_cat_die()
     {
         Cat testCat = new Cat();

         assertEquals("null dies", testCat.die(), "this is not it");
     }
}
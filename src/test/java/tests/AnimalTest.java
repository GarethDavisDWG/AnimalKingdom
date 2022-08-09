package tests;

import mainPackage.Animal;
import mainPackage.Cat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {

    @Test
    public void test_animal_move() {
        Animal testAnimal = new Animal();
        assertEquals("null moves to park", testAnimal.move("park"), "this is not it");
    }
    @Test
    public void test_animal_sleep() {
        Animal testAnimal = new Animal();
        assertEquals("null sleeps", testAnimal.sleep(), "this is not it");
    }
    @Test
    public void test_animal_poop() {
        Animal testAnimal = new Animal();
        assertEquals("null poops", testAnimal.poop(), "this is not it");
    }
    @Test
    public void test_animal_die() {
        Animal testAnimal = new Animal();
        assertEquals("null dies", testAnimal.die(), "this is not it");
    }
}

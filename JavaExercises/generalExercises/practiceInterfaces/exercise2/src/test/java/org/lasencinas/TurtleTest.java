package org.lasencinas;


public class TurtleTest {
    public static void main(String[] args) {
        Turtle turti = new Turtle("Turti");
        // Using Turtle type as Turtle, Walkable and Swimmable
        letItBite(turti);
        letItWalk(turti);
        letItSwim(turti);
        /**
         * Turti (a turtle) is biting.
         * Turti (a turtle) is walking.
         * Turti (a turtle) is swimming.
         */
    }

    public static void letItBite(Turtle t) {
        t.bite();
    }

    public static void letItWalk(Walkable w) {
        w.walk();
    }

    public static void letItSwim(Swimmable s) {
        s.swim();
    }
}


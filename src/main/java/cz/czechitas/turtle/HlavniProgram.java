package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        // barvy
        Color zelenaBarva;
        zelenaBarva = new Color(42, 170, 138);

        Color modraBarva;
        modraBarva = new Color(80, 194, 236);

        Color sedaBarva;
        sedaBarva = new Color(78, 75, 75);

        // obrazce
        nakresliKolecko(4, modraBarva);
        nakresliRovnostrannyTrojuhelnik(150, zelenaBarva);

        nakresliKoleckoJedna(4, sedaBarva);
        nakresliKoleckoDva(5, modraBarva);
        nakresliKoleckoTri(7, zelenaBarva);
        nakresliKoleckoCtyri(2, zelenaBarva);
        nakresliKoleckoPet(2, zelenaBarva);
        // nakresliDelsiStranu(70.0);
        // nakresliKratsiStranu(30.0);

    }

    public void prvniPohyb() {
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(400);
        zofka.turnRight(90);
        zofka.penDown();
    }

    public void nakresliKolecko(double delkaStrany, Color barva) {
        prvniPohyb();

        for (int i = 0; i < 107; i++) {
            zofka.setPenColor(barva);
            zofka.move(delkaStrany);
            zofka.turnRight(5);
        }

        zofka.turnRight(10);
    }

    public void nakresliRovnostrannyTrojuhelnik(double delkaStrany, Color barva) {
        zofka.setPenColor(barva);

        zofka.turnRight(10);
        zofka.move(delkaStrany);
        zofka.turnRight(145);
        zofka.move(delkaStrany);
        zofka.turnRight(110);
        zofka.move(80);

        zofka.penUp();
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(200);
        zofka.penDown();
    }

    public void nakresliKoleckoJedna(double delkaStrany, Color barva) {
        for (int i = 0; i < 123; i++) {
            zofka.setPenColor(barva);
            zofka.move(delkaStrany);
            zofka.turnRight(5);
        }

        zofka.turnLeft(150);
    }

    public void nakresliKoleckoDva(double delkaStrany, Color barva) {
        for (int i = 0; i < 102; i++) {
            zofka.setPenColor(barva);
            zofka.move(delkaStrany);
            zofka.turnRight(5);
        }
        zofka.turnLeft(150);
    }

    public void nakresliKoleckoTri(double delkaStrany, Color barva) {
        for (int i = 0; i < 72; i++) {
            zofka.setPenColor(barva);
            zofka.move(delkaStrany);
            zofka.turnRight(5);
        }

        zofka.turnLeft(105);

        zofka.penUp();
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.penDown();
    }

    public void nakresliKoleckoCtyri(double delkaStrany, Color barva) {
        for (int i = 0; i < 90; i++) {
            zofka.setPenColor(barva);
            zofka.move(delkaStrany);
            zofka.turnRight(5);
        }
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(170);
        zofka.turnRight(70);
        zofka.penDown();
    }

    public void nakresliKoleckoPet(double delkaStrany, Color barva) {
        for (int i = 0; i < 85; i++) {
            zofka.setPenColor(barva);
            zofka.move(delkaStrany);
            zofka.turnLeft(5);
        }
        zofka.penUp();
        zofka.move(150);
        zofka.turnRight(85);
    }
}

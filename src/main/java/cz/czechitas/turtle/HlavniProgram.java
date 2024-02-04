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

        Color zlutaBarva;
        zlutaBarva = new Color(239, 233, 41);

        // obrazce
        nakresliKolecko(4, modraBarva);
        nakresliRovnoRamennyTrojuhelnik(150, zelenaBarva);

        nakresliKoleckoJedna(4, sedaBarva);
        nakresliKoleckoDva(5, modraBarva);
        nakresliKoleckoTri(7, zelenaBarva);
        nakresliKoleckoCtyri(2, zelenaBarva);
        nakresliKoleckoPet(2, zelenaBarva);

        nakresliPravouhlyTrojuhelnik(80, sedaBarva);
        nakresliVlak(100.0, 170, zelenaBarva,
                     sedaBarva, 4.5, zlutaBarva, 2.5);

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

    public void nakresliRovnoRamennyTrojuhelnik(double delkaStrany, Color barva) {
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
        zofka.move(100);
        zofka.turnRight(85);
        zofka.move(200);
        zofka.turnRight(180);
        zofka.penDown();
    }

    public void nakresliPravouhlyTrojuhelnik(double delkaStrany, Color barva) {
        zofka.turnRight(85);
        zofka.setPenColor(barva);
        var velikostPrepony = Math.sqrt(2*Math.pow(delkaStrany, 2));

            zofka.move(delkaStrany);
            zofka.turnLeft(90);
            zofka.move(delkaStrany);
            zofka.turnLeft(135);
            zofka.move(velikostPrepony);
            zofka.turnLeft(130);
            zofka.move(delkaStrany);
            zofka.turnLeft(90);
            zofka.move(20);
    }

  public void nakresliVlak(double delkaStranyA, double delkaStranyB, Color barva,
                           Color barvaDva, double velkeKolo, Color barvaKola, double mensiKolo) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 2; i++) {
            zofka.move(delkaStranyA);
            zofka.turnRight(90);
            zofka.move(delkaStranyB);
            zofka.turnRight(90);
        }
         zofka.penUp();
         zofka.turnRight(90);
         zofka.move(delkaStranyB);
         zofka.turnLeft(90);
         zofka.penDown();

         zofka.setPenColor(barvaDva);
      for (int i = 0; i < 2; i++) {
          zofka.move(delkaStranyB);
          zofka.turnRight(90);
          zofka.move(delkaStranyA);
          zofka.turnRight(90);
      }

      zofka.setPenColor(barvaKola);
      for (int i = 0; i < 72; i++) {
          zofka.move(velkeKolo);
          zofka.turnRight(5);
      }

      zofka.penUp();
      zofka.turnLeft(90);
      zofka.move(delkaStranyB / 1.5);
      zofka.turnLeft(140);
      zofka.penDown();

      zofka.setPenColor(barvaKola);
      for (int i = 0; i < 70; i++) {
          zofka.move(mensiKolo);
          zofka.turnRight(5);
      }

      zofka.penUp();
      zofka.turnLeft(30);
      zofka.move(70);
      zofka.penDown();

      zofka.setPenColor(barvaKola);
      for (int i = 0; i < 70; i++) {
          zofka.move(mensiKolo);
          zofka.turnRight(5);
      }

      zofka.penUp();
      zofka.turnLeft(90);
      zofka.move(200);
      zofka.penUp();
  }

}

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

        Color zlutaBarva;
        zlutaBarva = new Color(255, 255, 0);

        Color sedaBarva;
        sedaBarva = new Color(78, 75, 75);

        // obrazce
        // nakresliRovnostrannyTrojuhelnik(50.0, zelenaBarva);

        // nakresliDelsiStranu(70.0);
        // nakresliKratsiStranu(30.0);

        //nakresliKolecko(4, zlutaBarva);
    }

}

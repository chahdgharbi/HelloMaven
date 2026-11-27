package tn.enis.calcul;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculMetierTest {
    @Test
    public void testAddition() {
        CalculMetier metier = new CalculMetier();
        assertTrue(metier.addition(9, 10) == 19, "La somme est fausse");
    }
    @Test
    public void testProduit() {
        CalculMetier metier = new CalculMetier();
        assertTrue(metier.multiplication(9, 10) == 90, "Le produit est faux");
    }
}

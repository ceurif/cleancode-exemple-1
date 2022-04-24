package app;

import app.activete2.Calcul;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

public class CalculTest {
    @Test
    public void testConstructeur() throws Exception {
        Constructor constructor = Calcul.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()), "Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }
    @Test
    public void testSomme() { assertEquals(5, Calcul.somme(2,3)); }

    @Test
    public void testDivision() {
        assertEquals(4, Calcul.division(8,2));
    }

    @Test
    public void noteBornee() {
        assertEquals(12.5, Calcul.noteBornee(12.5,0.0,20.0));
    }

    @Test
    public void noteBorneeMax() {
        assertEquals(20.0, Calcul.noteBornee(21,0.0,20.0));
    }

    @Test
    public void noteBorneeMin() {
        assertEquals(5.0, Calcul.noteBornee(4,5.0,20.0));
    }

    @Test
    public void testDivisionBy0() {
        try {
            Calcul.division(1, 0);
            fail("Expected exception was not thrown");
        } catch (IllegalArgumentException e) {
            assertNotNull(e);
        }
    }
}

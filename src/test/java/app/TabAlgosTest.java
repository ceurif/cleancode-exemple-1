package app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TabAlgosTest {
    @Test
    void plusGrandTest() {
        int[] tab1 = {1,20,9};
        Assertions.assertEquals(20,TabAlgos.plusGrand(tab1));
    }

    @Test
    void moyenneTest() {
        int[] tab1 = {1,10,9,20};
        Assertions.assertEquals(10,TabAlgos.moyenne(tab1));
    }

    @Test
    void moyenneTestException() {
        int[] tab1 = null;
        try {
            TabAlgos.moyenne(tab1);
            fail("Expected exception was not thrown");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    void egauxTestFalseOnSize() {
        int[] tab1 = {1,10,9,20};
        int[] tab2 = {1,10,9};
        Assertions.assertEquals(false,TabAlgos.egaux(tab1,tab2));
    }

    @Test
    void egauxTestFalse() {
        int[] tab1 = {1,10,9,20};
        int[] tab2 = {1,10,9,24};
        Assertions.assertEquals(false,TabAlgos.egaux(tab1,tab2));
    }
    @Test
    void egauxTestTrue() {
        int[] tab1 = {1,10,9,20};
        int[] tab2 = {1,10,9,20};
        Assertions.assertEquals(true,TabAlgos.egaux(tab1,tab2));
    }

    @Test
    void similairesTestTrue() {
        int[] tab1 = {1,10,9,20};
        int[] tab2 = {10,9,20,1};
        Assertions.assertEquals(true,TabAlgos.similaires(tab1,tab2));
    }

    @Test
    void similairesTestFalse() {
        int[] tab1 = {1,10,9,20};
        int[] tab2 = {2,10,9,1};
        Assertions.assertEquals(false,TabAlgos.similaires(tab1,tab2));
    }

    @Test
    void similairesTestFalseOnSize() {
        int[] tab1 = {1,10,9,20};
        int[] tab2 = {10,9,1};
        Assertions.assertEquals(false,TabAlgos.similaires(tab1,tab2));
    }
}
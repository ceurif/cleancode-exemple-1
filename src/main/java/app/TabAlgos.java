package app;

import java.util.Arrays;

/** Classe TabAlgos.
 *
 * @author c.diouf@etud.u-picardie.fr (Cherif Diouf)
 * */
public final class TabAlgos {
    /**
     * Constructeur protected avec exception
     *  pour empecher l'instantiation de la classe.
     *  @throws Exception if instanciate
     */
    private TabAlgos() throws Exception {
        throw new Exception("cette classe ne peut pas être instanciée");
    }

    /** @return valeur la plus grande d'un tableau.
     * @param tab tableau
     * */
    public static int plusGrand(final int[] tab) {
        int grand = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > grand) {
                grand = tab[i];
            }
        }
        return grand;
    }

    /**
     * @return moyenne des valeurs du tableau.
     * @throw IllegalArgumentException si tab et null ou vide.
     * @param tab tableau
     **/
    public static double moyenne(final int[] tab) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException();
        }
        int sum = Arrays.stream(tab).sum();
        return (double) sum / tab.length;
    }

    /** Compare le contenu de 2 tableaux en tenant compte de l'ordre.
     * @return true si les 2 tableaux contiennent les mêmes éléments
     * avec les mêmes nombres d'occurences (dans le meme ordre).
     * @param tab1 premier tableau
     * @param tab2 deuxieme tableau
     **/
    public static boolean egaux(final int[] tab1, final int[] tab2) {
       if (tab1.length != tab2.length) {
           return false;
       }
       Arrays.sort(tab1);
       Arrays.sort(tab2);

        for (int i = 0; i < tab1.length; i++) {
            if (tab1[i] != tab2[i]) {
                return false;
            }
        }
        return true;
    }

    /** Compare le contenu de 2 tableaux sans tenir compte de l'ordre.
     * @return true si les 2 tableaux contiennent les mêmes éléments
     * avec les mêmes nombres d'occurrence (pas forcément dans le meme ordre).
     *
     * @param tab1 premier tableau
     * @param tab2 deuxieme tableau
     **/
    public static boolean similaires(final int[] tab1, final int[] tab2) {
        if (tab1.length != tab2.length) {
            return false;
        }
        Arrays.sort(tab1);
        Arrays.sort(tab2);
        for (int i = 0; i < tab1.length; i++) {
            if (tab1[i] != tab2[i]) {
                return false;
            }
        }
        return true;
    }
}

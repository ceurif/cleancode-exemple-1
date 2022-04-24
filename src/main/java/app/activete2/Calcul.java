package app.activete2;

/** Classe Calcul.
 *
 * @author c.diouf@etud.u-picardie.fr (Cherif Diouf)
 * */
public final class Calcul {
    /**
     * Constructeur protected avec exception
     *  pour empecher l'instantiation de la classe.
     *  @throws Exception if instanciate
     */
    private Calcul() {
    }
    /** Calcul la somme de deux nombres.
     * @param a int
     * @param b int
     * @return la somme a+b
     **/
    public static int somme(final int a, final int b) {
        return a + b;
    }
    /** Renvoie la note, bornée par les valeurs min et max, exemples.
     * noteBornee(12.5,0.0,20.0) doit renvoyer 12.2
     * noteBornee(25.0,0.0,20.0) doit renvoyer 20.0 *
     * noteBornee(-2.0,0.0,20.0) doit renvoyer 0.0
     * @param max double
     * @param min double
     * @param note double
     * @return note
     **/
    public static double noteBornee(final double note,
                                    final double min, final double max) {
        if (note >= max) {
            return max;
        }
        if (note <= min) {
            return min;
        }
        return note;
    }

    /** @return a / b si b != 0
     * @param a int
     * @param b int
     * @throw IllegalArgumentException si b == 0
     */
    public static int division(final int a, final int b) {
        if (b == 0) {
            throw new IllegalArgumentException("b ne doit pas etre 0");
        }
        return a / b;
    }
}

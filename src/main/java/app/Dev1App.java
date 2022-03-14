package app;

/** Classe Main.
 *
 * @author c.diouf@etud.u-picardie.fr (Cherif Diouf)
 * */
public final class Dev1App {
    /**
     * Constructeur protected avec exception
     *  pour empecher l'instantiation de la classe.
     *  @throws Exception if instanciate
     */
    private Dev1App() throws Exception {
        throw new Exception("cette classe ne peut pas être instanciée");
    }

    /** Main method.
     * @param args args
     * */
    public static void main(final String[] args) {
        System.out.println("Ceurif");
    }
}

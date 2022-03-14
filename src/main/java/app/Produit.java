package app;

import java.util.Objects;

/** Classe Produit représentant un produit avec un prix et une référence.
 *
 * @author c.diouf@etud.u-picardie.fr (Cherif Diouf)
 * */
public class Produit {
    /**
     * The reference.
     */
    private String reference;
    /**
     * The prix.
     */
    private double prix;

    /**
     * Constructeur public.
     * @param ref reference
     */
    public Produit(final String ref) {
        this.reference = ref;
    }

    /** @return le prix. */
    public final double getPrix() {
        return this.prix;
    }

    /** modifie le prix.
     * @param p prix
     * */
    public final void setPrix(final Double p) {
        this.prix = p;
    }

    /**
     * @param ref reference
     */
    public final void setReference(final String ref) {
        this.reference = ref;
    }

    /**
     * @param p prix
     */
    public final void setPrix(final double p) {
        this.prix = p;
    }

    /**
     * @return la reference si le prix est positif, null sinon.
     */
    public final String getReference() {
        String resultat = reference;
        if (prix > 0) {
            return resultat;
        } else {
            return null;
        }
    }
    @Override
    public final boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (!getClass().isInstance(o))
            return false;
        return reference.equals(((Produit) o).reference);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(reference);
    }
}

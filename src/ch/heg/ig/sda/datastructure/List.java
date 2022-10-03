package ch.heg.ig.sda.datastructure;

/**
 *
 * @author maximili.jeannere
 */
public interface List <E> {

    /** Retourne le nombre d'éléments stockés dans la liste.
     * @return Nombre d'éléments dans la liste. */
    int size( ); // (public abstract facultatifs)

    /** Retourne un booléen qui indique si la liste est vide.
     * @return True si la liste est vide. */
    boolean isEmpty( );

    /** Retourne l'élément à l'indice i.
     * @param i Indice
     * @return Instance de E à l'indice i */
    E get(int i) throws IndexOutOfBoundsException;

    /** Remplace l'élément à l'indice i par une instance de E et renvoie l'élément remplacé.
     * @param i Indice
     * @param element Instance de E.
     * @return  */
    E set(int i, E element);

    /** Insère un élément de type E à l'indice i, en décalant les éléments suivants d'un indice.
     * @param i Indice ou la element est ajoutée.
     * @param element Instance de E. */
    void add(int i, E element);

    void add(E element);

    /** Supprime et renvoie l'élément à l'indice i, en décalant les éléments suivants.
     * @param i indice
     * @return Instance de element supprimée*/
    E remove(int i);

}

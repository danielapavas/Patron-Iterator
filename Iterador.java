//Interfaz Iterator personalizada:
package Iterator;
/**
 * @param <E> Elemento generico para uso de de algoritmos
 */
public interface Iterador<E> {
    E next();
    boolean hasNext();
}

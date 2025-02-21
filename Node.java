public interface Node<E> {
    /**
     * @return
     */
    E getValor();
    // pre:
    // post: devuelve el valor del nodo

    /**
     * @param valor
     */
    void setValor(E valor);
    // pre:
    // post: se cambia el valor del valor del nodo

    /**
     * @return
     */
    Node<E> getSiguiente();
    // pre:
    // post: devuelve el siguiente nodo

    /**
     * @param nodo
     */
    void setSiguiente(Node<E> nodo);
    // pre:
    // post: se cambia el valor del siguiente nodo

    /**
     * @return
     */
    Node<E> getAnterior();
    // pre:
    // post: devuelve el siguiente nodo

    /**
     * @param nodo
     */
    void setAnterior(Node<E> nodo);
    // pre:
    // post: se cambia el valor del siguiente nodo
}
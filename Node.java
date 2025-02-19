public interface Node<E> {
    E getValor();
    // pre:
    // post: devuelve el valor del nodo

    void setValor(E valor);
    // pre:
    // post: se cambia el valor del valor del nodo

    Node<E> getSiguiente();
    // pre:
    // post: devuelve el siguiente nodo

    void setSiguiente(Node<E> nodo);
    // pre:
    // post: se cambia el valor del siguiente nodo

    Node<E> getAnterior();
    // pre:
    // post: devuelve el siguiente nodo

    void setAnterior(Node<E> nodo);
    // pre:
    // post: se cambia el valor del siguiente nodo
}
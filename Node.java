public interface Node<E> {
    public E getValor()
    // pre:
    // post: devuelve el valor del nodo

    public void setValor()
    // pre:
    // post: se cambia el valor del valor del nodo

    public Node<E> getSiguiente()
    // pre:
    // post: devuelve el siguiente nodo

    public void setSiguiente(Node<E> nodo)
    // pre:
    // post: se cambia el valor del siguiente nodo
}
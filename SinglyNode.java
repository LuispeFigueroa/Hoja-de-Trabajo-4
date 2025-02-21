public class SinglyNode<E> implements Node<E> {
    // Atributos
    public E valor;
    public Node<E> siguiente;
    
    // Metodos
    /**
     * @param valor
     */
    public SinglyNode(E valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    @Override
    public E getValor() {
        return this.valor;
    }

    @Override
    public void setValor(E valor) {
        this.valor = valor;
    }

    @Override
    public Node<E> getSiguiente() {
        return this.siguiente;
    }

    @Override
    public void setSiguiente(Node<E> nodo) {
        this.siguiente = nodo;
    }

    @Override
    public Node<E> getAnterior() {
        return null;
    }

    @Override
    public void setAnterior(Node<E> nodo) {
        // No se puede establecer un anterior a un nodo en una lista enlazada simple
    }
}

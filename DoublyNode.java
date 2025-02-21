public class DoublyNode<E> implements Node<E> {
    // Atributos
    /**
     *
     */
    private Node<E> anterior;
    /**
     *
     */
    public Node<E> siguiente;
    /**
     *
     */
    public E valor;
    
    // Constructor
    /**
     * @param valor
     */
    public DoublyNode(E valor) {
        this.valor = valor;
        this.anterior = null;
        this.siguiente = null;
    }

    @Override
    public Node<E> getAnterior() {
        return this.anterior;
    }

    @Override
    public void setAnterior(Node<E> nodo) {
        this.anterior = nodo;
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
}

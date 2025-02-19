public class DoublyNode<E> implements Node<E> {
    // Atributos
    /**
     *
     */
    private Node<E> anterior;
    public Node<E> siguiente;
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

    public Node<E> getAnterior() {
        return this.anterior;
    }

    public void setAnterior(Node<E> nodo) {
        this.anterior = nodo;
    }

    public E getValor() {
        return this.valor;
    }

    public void setValor(E valor) {
        this.valor = valor;
    }

    public Node<E> getSiguiente() {
        return this.siguiente;
    }

    public void setSiguiente(Node<E> nodo) {
        this.siguiente = nodo;
    }
}

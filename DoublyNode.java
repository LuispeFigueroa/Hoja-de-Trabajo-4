public class DoublyNode<E> extends abstractNode<E> {
    // Atributos
    /**
     *
     */
    private DoublyNode<E> anterior;

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
}

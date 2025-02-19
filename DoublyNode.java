public class DoublyNode<E> extends abstractNode<E> {
    // Atributos
    /**
     *
     */
    private E valor;
    /**
     *
     */
    private DoublyNode<E> anterior;
    /**
     *
     */
    private DoublyNode<E> siguiente;

    // Constructor
    /**
     * @param valor
     */
    public DoublyNode(E valor) {
        this.valor = valor;
        this.anterior = null;
        this.siguiente = null;
    }
}

public class SinglyNode<E> extends abstractNode<E> {
    // Atributos
    /**
     *
     */
    private E valor;
    /**
     *
     */
    private SinglyNode<E> siguiente;

    // Constructor
    /**
     * @param valor
     */
    public SinglyNode(E valor) {
        this.valor = valor;
        this.siguiente = null;
    }
}

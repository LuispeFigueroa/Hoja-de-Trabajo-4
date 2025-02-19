public class SingleLinkedList<E> extends abstractList<E> {
    // Métodos
    public SingleLinkedList(E valor) {
        this.valor = valor;
        this.head = null;
    }

    @Override
    public void add(E valor) {
        Node<E> nuevoNodo = new SinglyNode<>(valor);
        nuevoNodo.setSiguiente(this.head);
        this.head = nuevoNodo;
    }
}

public class SingleLinkedList<E> extends abstractList<E> {
    // Métodos
    public SingleLinkedList() {
        this.size = 0;
        this.head = null;
    }

    @Override
    public void add(E valor) {
        Node<E> nuevoNodo = new SinglyNode<E>(valor);
        nuevoNodo.setSiguiente(this.head);
        this.head = nuevoNodo;
    }
}

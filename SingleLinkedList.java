public class SingleLinkedList<E> extends abstractList<E> {
    // Métodos
    public SingleLinkedList(E valor) {
        this.valor = valor;
        this.head = null;
    }

    @Override
    public void add(E valor) {
        Node<E> newNode = new SinglyNode<>(valor);
        newNode.setSiguiente(this.head);
        this.head = newNode;
    }
}

public class DoubleLinkedList<E> extends abstractList<E> {
    // Atributos
    private Node<E> tail;

    // Métodos
    public SingleLinkedList(E valor) {
        this.valor = valor;
        this.head = null;
        this.tail = null;
    }

    @Override
    public void add(E valor) {
        Node<E> nuevoNodo = new DoublyNode<>(valor);
        nuevoNode.setSiguiente(this.head);
        if (this.head != null) {
            this.head.setAnterior(nuevoNodo);
        }
        this.head = nuevoNodo;
    }
}

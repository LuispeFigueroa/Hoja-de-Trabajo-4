public class DoubleLinkedList<E> extends abstractList<E> {
    // Atributos
    private Node<E> tail;

    // Métodos
    public DoubleLinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    @Override
    public void add(E valor) {
        size++;
        Node<E> nuevoNodo = new DoublyNode<>(valor);
        nuevoNodo.setSiguiente(this.head);
        if (this.head != null) {
            this.head.setAnterior(nuevoNodo);
        }
        this.head = nuevoNodo;
        if (this.size == 1) {
            this.tail = nuevoNodo;
        }
    }
}

public class DoubleLinkedList<E> extends abstractList<E> {
    // Atributos
    /**
     *
     */
    private Node<E> tail;

    // Métodos
    /**
     * 
     */
    public DoubleLinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    @Override
    public void add(E valor) {
        size++;
        Node<E> nuevoNodo = new DoublyNode<>(valor);
        if (this.head != null) {
            this.tail.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(this.tail);
        }
        else{
            this.head = nuevoNodo;
        }
        this.tail = nuevoNodo;
    }

    @Override
    public E remove() {
        if (this.size == 0) {
            throw new IllegalStateException("La lista está vacía");
        }
        E valor = this.tail.getValor();

        if (this.size == 1) {
            this.head = null;
            this.tail = null;
        }
        else {
            Node<E> newTail = this.tail.getAnterior();
            this.tail.setAnterior(null);
            this.tail = newTail;
            this.tail.setSiguiente(null);
        }
        size--;
        return valor;
    }

    @Override
    public E getTail() {
        if (this.size == 0) {
            throw new IllegalStateException("La lista está vacía");
        }
        return this.tail.getValor();
    }
}

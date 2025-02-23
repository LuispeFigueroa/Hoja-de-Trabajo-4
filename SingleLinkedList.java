public class SingleLinkedList<E> extends abstractList<E> {
    // Métodos
    /**
     * 
     */
    public SingleLinkedList() {
        this.size = 0;
        this.head = null;
    }

    @Override
    public void add(E valor) {
        size++;
        Node<E> nuevoNodo = new SinglyNode<E>(valor);
        if (this.head == null) {
            this.head = nuevoNodo;
        }
        else {
            Node<E> ultimoNodo = this.head;
            while (ultimoNodo.getSiguiente() != null) {
                ultimoNodo = ultimoNodo.getSiguiente();
            }
            ultimoNodo.setSiguiente(nuevoNodo);
        }
    }

    @Override
    public E remove() {
        if (this.size == 0) {
            throw new IllegalStateException("La lista está vacía");
        }
        size--;
        Node<E> penultimoNodo = null;
        Node<E> ultimoNodo = this.head;
        while (ultimoNodo.getSiguiente() != null) {
            penultimoNodo = ultimoNodo;
            ultimoNodo = ultimoNodo.getSiguiente();
        }
        E valor = ultimoNodo.getValor();
        if (penultimoNodo != null) {
            penultimoNodo.setSiguiente(null);
        } else {
            this.head = null;
        }
        return valor;
    }

    @Override
    public E getTail() {
        if (this.size == 0) {
            throw new IllegalStateException("La lista está vacía");
        }
        Node<E> ultimoNodo = this.head;
        while (ultimoNodo.getSiguiente() != null) {
            ultimoNodo = ultimoNodo.getSiguiente();
        }
        E valor = ultimoNodo.getValor();
        return valor;
    }
}

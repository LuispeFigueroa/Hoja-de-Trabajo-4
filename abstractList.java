public abstract class abstractList<E> implements List<E> {
    protected Node<E> head;

    public abstract void add(E valor);

    @Override
    public E remove() {
        if (isEmpty()) throw new IllegalStateException("La lista está vacía");
        E valor = this.head.getValor();
        this.head = this.head.getSiguiente();
        return valor;
    }

    @Override
    public E getHead() {
        if (isEmpty()) throw new IllegalStateException("La lista está vacía");
        return this.head.getValor();
    }
}

public abstract class abstractNode<E> implements Node<E> {
    protected E valor;
    protected Node<E> siguiente;

    protected E getValor() {
        return this.valor;
    }

    protected Node<E> getSiguiente() {
        return this.siguiente;
    }
}
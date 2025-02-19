public abstract class abstractNode<E> implements Node<E> {
    protected E valor;
    protected Node<E> siguiente;

    public E getValor() {
        return this.valor;
    }

    public void setValor(E valor) {
        this.valor = valor;
    }

    public Node<E> getSiguiente() {
        return this.siguiente;
    }

    public void setSiguiente(Node<E> nodo) {
        this.siguiente = nodo;
    }
}
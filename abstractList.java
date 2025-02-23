public abstract class abstractList<E> implements List<E> {
    /**
     *
     */
    protected Node<E> head;
    /**
     *
     */
    protected int size;

    @Override
    public abstract void add(E valor);

    @Override
    public abstract E remove();

    @Override
    public abstract E getTail();
}

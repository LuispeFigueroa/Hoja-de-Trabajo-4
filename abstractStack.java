abstract public class abstractStack<E> implements Stack<E> {
    /**
     *
     */
    protected int count = 0;

    @Override
    public abstract void push(E e);

    @Override
    public abstract E pop();

    @Override
    public abstract E peek();

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int size() {
        return count;
    }
}

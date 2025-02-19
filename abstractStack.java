abstract public class abstractStack<E> implements Stack<E> {
    /**
     *
     */
    protected int count = 0;

    protected abstract void push(E e);

    protected abstract E pop();

    protected abstract E peek();

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int size() {
        return count;
    }
}

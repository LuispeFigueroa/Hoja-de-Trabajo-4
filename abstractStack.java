abstract public class abstractStack<E> implements Stack<E> {
    /**
     *
     */
    protected int count = 0;

    public abstract void push(E e);

    public abstract E pop();

    public abstract E peek();

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }
}

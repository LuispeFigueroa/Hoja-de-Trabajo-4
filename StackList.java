public class StackList<E> extends abstractStack<E> {
    // Atributos
    /**
     *
     */
    private List<E> stack;

    // Métodos
    /**
     * @param tipo
     */
    public StackList(String tipo) {
        ListFactory<E> factory = new ListFactory<E>();
        this.stack = factory.getList(tipo);
    }

    @Override
    public void push(E elemento) {
        this.stack.add(elemento);
        this.count++;
    }

    @Override
    public E pop() {
        if (this.isEmpty()) {
            throw new IllegalStateException("Stack vacío");
        }
        this.count--;
        return this.stack.remove();
    }

    @Override
    public E peek() {
        if (this.isEmpty()) {
            throw new IllegalStateException("Stack vacío");
        }
        return this.stack.getTail();
    }
}

import java.util.ArrayList;

public class StackArrayList<E> extends abstractStack<E> {
    // Atributos
    private ArrayList<E> stack;

    // Métodos
    public StackArrayList() {
        this.stack = new ArrayList<E>();
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
        return this.stack.remove(this.stack.size() - 1);
    }

    @Override
    public E peek() {
        if (this.isEmpty()) {
            throw new IllegalStateException("Stack vacío");
        }
        return this.stack.get(this.stack.size() - 1);
    }
}

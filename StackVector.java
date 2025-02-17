import java.util.Vector;

public class StackVector<E> extends abstractStack<E> {
    // Atributos
    /**
     *
     */
    private Vector<E> stack;

    // Métodos
    /**
     * 
     */
    public StackVector() {
        this.stack = new Vector<E>();
    }

    // Metodo para agregar elementos
    @Override
    public void push(E elemento) {
        this.stack.add(elemento);
    }

    // Metodo para eliminar y devolver el último elemento agregado
    @Override
    public E pop() {
        if (this.isEmpty()) {
            throw new IllegalStateException("El stack esta vacío");
        }
        return this.stack.remove(this.stack.size() - 1);
    }

    // Metodo revisar
    @Override
    public E peek() {
        if (this.isEmpty()) {
            throw new IllegalStateException("El stack esta vacío");
        }
        return this.stack.get(this.stack.size() - 1);
    }
}

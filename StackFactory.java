public class StackFactory<E> {
    public StackFactory() {
        // Constructor para StackFactory
    }

    public Stack<E> getStack(String tipoStack, String tipoLista) {
        if (tipoStack.equals("vector")) {
            return new StackVector<E>();
        }
        else if (tipoStack.equals("arraylist")) {
            return new StackArrayList<E>();
        }
        else if (tipoStack.equals("list")) {
            return new StackList<E>(tipoLista);
        }
        return null;
    }
}

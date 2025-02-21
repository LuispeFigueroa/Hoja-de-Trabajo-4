public class StackFactory<E> {
    public StackFactory() {
        // Constructor para StackFactory
    }

    public Stack<E> getStack(String tipoStack, String tipoLista) {
        if (tipoStack.equalsIgnoreCase("vector")) {
            return new StackVector<E>();
        }
        else if (tipoStack.equalsIgnoreCase("arraylist")) {
            return new StackArrayList<E>();
        }
        else if (tipoStack.equalsIgnoreCase("list")) {
            return new StackList<E>(tipoLista);
        }
        return null;
    }
}

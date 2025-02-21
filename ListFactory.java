public class ListFactory<E> {
    public ListFactory() {
        // Constructor para ListFactory
    }

    public List<E> getList(String tipo) {
        if (tipo.equalsIgnoreCase("simple")) {
            return new SingleLinkedList<E>();
        }
        else if (tipo.equalsIgnoreCase("double")) {
            return new DoubleLinkedList<E>();          
        }
        return null;
    }
}

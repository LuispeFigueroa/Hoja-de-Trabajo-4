public class ListFactory<E> {
    public ListFactory() {
        // Constructor para ListFactory
    }

    public List<E> getList(String tipo) {
        if (tipo == "simple") {
            return new SingleLinkedList<E>();
        }
        else if (tipo == "double") {
            return new DoubleLinkedList<E>();          
        }
        return null;
    }
}

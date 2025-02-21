public class ListFactory<E> {
    /**
     * 
     */
    public ListFactory() {
        // Constructor para ListFactory
    }

    /**
     * @param tipo
     * @return
     */
    public List<E> getList(String tipo) {
        if (tipo.equalsIgnoreCase("simple")) {
            return new SingleLinkedList<E>();
        }
        else if (tipo.equalsIgnoreCase("doble")) {
            return new DoubleLinkedList<E>();          
        }
        return null;
    }
}

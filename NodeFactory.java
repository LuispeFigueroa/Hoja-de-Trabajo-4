public class NodeFactory {
    public Node<E> getNode(String tipo) {
        if (tipo.equals("simple")) {
            return new SinglyNode()
        }
        else if (tipo.equals("doble")) {
            return new DoublyNode()
        }
        return null
    }
}
public interface List<E> {
    public void add(E)
    //pre: 
    //post: nodo con elemento se agrega a la lista

    public E remove()
    //pre: lista no esta vacía
    //post: se devuelve el valor del último nodo y se elimina el nodo

    public E getHead()
    //pre: lista no esta vacía
    //post: se devuelve el valor del último nodo
}

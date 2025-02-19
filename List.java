public interface List<E> {
    void add(E elemento);
    //pre: 
    //post: nodo con elemento se agrega a la lista

    E remove();
    //pre: lista no esta vacía
    //post: se devuelve el valor del último nodo y se elimina el nodo

    E getHead();
    //pre: lista no esta vacía
    //post: se devuelve el valor del último nodo
}

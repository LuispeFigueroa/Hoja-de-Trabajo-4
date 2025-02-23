public interface List<E> {
    /**
     * @param elemento
     */
    void add(E elemento);
    //pre: 
    //post: nodo con elemento se agrega a la lista

    /**
     * @return
     */
    E remove();
    //pre: lista no esta vacía
    //post: se devuelve el valor del último nodo y se elimina el nodo

    /**
     * @return
     */
    E getTail();
    //pre: lista no esta vacía
    //post: se devuelve el valor del último nodo
}

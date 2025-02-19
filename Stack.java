public interface Stack<E> 
{
   /**
    * @param item
    */
   void push(E item);
   // pre: 
   // post: item se agrega a stack
   
   /**
    * @return
    */
   E pop();
   // pre: stack no está vacío
   // post: el último elemento pusheado se elimina del stack y se devuelve
   
   /**
    * @return
    */
   E peek();
   // pre: stack no está vacío
   // post: se devuelve el último valor agregado
   
   /**
    * @return
    */
   boolean isEmpty();
   // post: devuelve True si el stack está vacío
   
   /**
    * @return
    */
   int size();
   // post: devuelve el número de elementos en el stack

}
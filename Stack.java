public interface Stack<E> 
{
   /**
    * @param item
    */
   public void push(E item);
   // pre: 
   // post: item se agrega a stack
   
   /**
    * @return
    */
   public E pop();
   // pre: stack no está vacío
   // post: el último elemento pusheado se elimina del stack y se devuelve
   
   /**
    * @return
    */
   public E peek();
   // pre: stack no está vacío
   // post: se devuelve el último valor agregado
   
   /**
    * @return
    */
   public boolean isEmpty();
   // post: devuelve True si el stack está vacío
   
   /**
    * @return
    */
   public int size();
   // post: devuelve el número de elementos en el stack

}
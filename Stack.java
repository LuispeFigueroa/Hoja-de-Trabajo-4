public interface Stack<E> 
{

   /**
    * @param item
    */
   public void push(E item);
   // pre: 
   // post: item is added to stack
   // will be popped next if no intervening push
   
   /**
    * @return
    */
   public E pop();
   // pre: stack is not empty
   // post: most recently pushed item is removed and returned
   
   /**
    * @return
    */
   public E peek();
   // pre: stack is not empty
   // post: top value (next to be popped) is returned
   
   /**
    * @return
    */
   public boolean empty();
   // post: returns true if and only if the stack is empty
   
   /**
    * @return
    */
   public int size();
   // post: returns the number of elements in the stack

}
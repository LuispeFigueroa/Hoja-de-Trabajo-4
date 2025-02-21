import org.junit.*;
import  static org.junit.Assert.*;
import java.util.Stack;

public class StackArrayListTest {
    private StackArrayList<Integer> stack;


    @Before
    public void setUp(){

        stack = new StackArrayList<>();
    }

    /**
     * 
     */
    @Test
    public void testPushyPop(){
        stack.push(15); // primer elemento en entrar 
        stack.push(24);
        stack.push(37);// ultimo elemento en entrar 
        assertEquals(37,(int) stack.pop()); 
        assertEquals(24, (int) stack.pop());
        assertEquals(15, (int) stack.pop());
    }

    @Test
    public void testPeek(){
        stack.push(7);
        assertEquals(7, (int) stack.peek()); // debe regresar el ultimo elemento pusheado
    }

    @Test
    public void testIsEmpty(){
        assertTrue(stack.isEmpty()); // True, porque no deberia tener elementos
        stack.push(4); // agregamos elemento para  que no este vacia
        assertFalse(stack.isEmpty()); // False, porque ahora tiene un elemento
    }

    


    
    
}
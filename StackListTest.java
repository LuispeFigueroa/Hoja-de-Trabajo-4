import org.junit.*;
import  static org.junit.Assert.*;

public class StackListTest {

    private StackList<String> stack;
   
    /**
     * 
     */
    @Before
    public void setUp(){
        stack = new StackList<>("simple");
    } 

    /**
     * 
     */
    @Test
    public void testPushyPop() {
        stack.push("4");
        stack.push("8");
        assertEquals("8", stack.pop());
    }
    
    /**
     * 
     */
    @Test
    public void testPeek(){
        stack.push("7");
        assertEquals("7", stack.peek()); // debe regresar el ultimo elemento pusheado
    }

    /**
     * 
     */
    @Test
    public void testIsEmpty(){
        assertTrue(stack.isEmpty()); // True, porque no deberia tener elementos
        stack.push("4"); // agregamos elemento para  que no este vacia
        assertFalse(stack.isEmpty()); // False, porque ahora tiene un elemento
    }
}

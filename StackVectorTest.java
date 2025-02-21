import org.junit.*;
import  static org.junit.Assert.*;


public class StackVectorTest {

    public StackVector<String> stack;

    @Before
    public void setUp() {
        stack = new StackVector<>();
    }
    
    @Test
    public void testPush() {
        stack.push("A");
        stack.push("B");
        assertEquals("B", stack.peek());

    }
    @Test 
    public void testPop() {
        stack.push("1");
        stack.push("2");
        assertEquals("2", stack.pop());
        assertEquals("1", stack.pop());
    }
    @Test
    public void testPeek() {
        stack.push("5");
        assertEquals("5", stack.peek());
    }
    
}

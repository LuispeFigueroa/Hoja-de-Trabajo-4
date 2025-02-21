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
    
}

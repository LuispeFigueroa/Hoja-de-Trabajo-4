import org.junit.*;
import  static org.junit.Assert.*;
import java.util.Stack;

public class StackListTest {

    private StackList<String> stack;
   
    @Before
    public void setUp(){
        stack = new StackList<>("simple");
    } 

    @Test
    public void testPush() {
        stack.push("4");
        stack.push("8");
        assertEquals("8", stack.pop());
    }
    
}

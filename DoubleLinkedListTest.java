import org.junit.*;
import  static org.junit.Assert.*;

public class DoubleLinkedListTest {

    private List<String> list;
   
    /**
     * 
     */
    @Before
    public void setUp(){
        list = new DoubleLinkedList<String>();
    } 

    @Test
    public void testAddyGetHead() {
        list.add("4");
        list.add("8");
        assertEquals("8", list.getTail());
    }
    
    @Test
    public void testRemove(){
        list.add("7");
        list.add("9");
        assertEquals("9", list.remove());
        assertEquals("7", list.getTail());
    }

}
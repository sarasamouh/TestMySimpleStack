package dcll.ssam;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mousa on 14/04/2016.
 */
public class SimpleStackImplTest extends TestCase {

    SimpleStack simpleStack;

    @Before
    public  void setUp() throws Exception{
        simpleStack = new SimpleStackImpl();
        System.out.println("je suis exécuter avent chaque test");
    }
    @Test
    public void testIsEmpty() throws Exception {


        Assert.assertEquals(true,simpleStack.isEmpty());
        String element1="toto";
        simpleStack.push(new Item(new String(element1)));
        Assert.assertEquals(false,simpleStack.isEmpty());
    }

    public void testGetSize() throws Exception {
       assertEquals(0,simpleStack.getSize());
         String element1="sara";
        String element2="mou";
        simpleStack.push(new Item(element1));
        simpleStack.push(new Item(element2));
        assertEquals(2,simpleStack.getSize());

    }

    public void testPush() throws Exception {


        assertEquals(0,simpleStack.getSize());
        Item IT = new Item(new Integer (8));
        simpleStack.push(IT);
        assertEquals(1,simpleStack.getSize());

        Item s =  simpleStack.peek();

        assertTrue(s.getValue() instanceof Integer);
        Integer integer =(Integer)s.getValue();
        assertEquals(8, integer.intValue());
        assertEquals(IT.getValue(),integer);
    }

    public void testPeek() throws Exception {

        assertEquals(0,simpleStack.getSize());
        Item IT = new Item(new Integer (8));
        simpleStack.push(IT);
        assertEquals(1,simpleStack.getSize());

        Item s =  simpleStack.peek();

        assertTrue(s.getValue() instanceof Integer);
        Integer integer =(Integer)s.getValue();
        assertEquals(8, integer.intValue());
        assertEquals(IT.getValue(),integer);
    }

    public void testPop() throws Exception {

    }
}
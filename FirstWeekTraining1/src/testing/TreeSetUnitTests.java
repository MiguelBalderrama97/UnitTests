package testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

class TreeSetUnitTests {

	private TreeSet<Object> ts = new TreeSet<>();
	Object objArray[] = new Object[1000];
	
	
	@Test
	void addStack() {
		ts.add(new Integer(-8));
        assertTrue(ts.contains(new Integer(-8)), "Failed to add Object");
        assertTrue(ts.size() != objArray.length + 1, "Not Added existing element");
	}
	
	@Test
	void addAll() {
		TreeSet s = new TreeSet();
        s.addAll(ts);
        assertTrue(s.size() == ts.size(), "Incorrect size after add");
        Iterator i = ts.iterator();
        while (i.hasNext())
            assertTrue(s.contains(i.next()), "Returned incorrect set");
	}
	
	@Test
	void clear() {
        ts.clear();
        assertEquals(0, ts.size(), "Returned non-zero size after clear");
    }
	
	@Test
	protected
	Object clone() {
        TreeSet s = (TreeSet) ts.clone();
        Iterator i = ts.iterator();
        while (i.hasNext())
            assertTrue(s.contains(i.next()), "Clone failed to copy all elements");
		return i;
    }
	
	@Test
	void isEmpty() {
        assertTrue(new TreeSet().isEmpty(), "Empty set returned false");
        assertTrue(ts.isEmpty(), "Non-Empty returned true");
    }

}

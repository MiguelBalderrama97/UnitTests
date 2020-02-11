package testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Stack;

import org.junit.jupiter.api.Test;

import models.Employee;

class StackUnitTests {

	@Test
	void checkSize() {
		Stack stack = new Stack();
		stack.push("Hello");
		stack.push(null);
		stack.push(new Employee(8, "Jose"));
		stack.push(6);
		stack.push(null);
		
		assertEquals(5, stack.size());
	}
	
	@Test
	void search() {
		Stack stack = new Stack();
		stack.push("Hello");
		stack.push(null);
		stack.push(new Employee(8, "Jose"));
		stack.push(6);
		stack.push(null);
		
		System.out.println(stack.peek());
	}
	
	private Stack<Object> stack = new Stack();
	
	@Test
    public void pushTwoObjectsToEmtyStackCheckThatSizeIsTwo() {
        pushObjectsInOrder(null, new Object());
        assertEquals(2, stack.size());
        System.out.println(stack.size());
    }
	
    @Test
    public void pushTwoObjectToEmptyStackAndPopTheSameObjectsInReversedOrder() {
    	Object A = new Object();
    	Object B = new Object();
    	pushObjectsInOrder(A, B);
    	assertEquals(B, stack.pop());
        assertEquals(A, stack.pop());
    }
    
    private void pushObjectsInOrder(Object... objects) {
        for (Object object : objects) {
            stack.push(object);
        }
    }

}

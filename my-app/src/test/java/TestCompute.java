import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.Before;
public class TestCompute {
	 Compute c;
	 MessageQueue mq;

	  @Before
	  public void setUp() {
		mq = mock(MessageQueue.class);
	    c = new Compute(mq);
	  }

  

	  @Test
	  public void example() {
	    assertTrue(true);
	  }
	  @Test
	    public void testCountNumberOfOccurrences_NullQueue() {
	        MessageQueue mockQueue = mock(MessageQueue.class);
	        
	        when(mockQueue.size()).thenReturn(0);
	        
	        Compute c = new Compute(mockQueue);
	        assertEquals(-1, c.countNumberOfOccurrences("test"));
	    }
	  @Test
	  public void testCountNumberOfOccurrences_EmptyQueue() {
	      when(mq.size()).thenReturn(0);
	      assertEquals(-1, c.countNumberOfOccurrences("test"));
	  }
	
	  @Test
	  public void testCountNumberOfOccurrences_ElementNotInQueue() {
	      when(mq.size()).thenReturn(3);
	      when(mq.contains("test")).thenReturn(false);
	      assertEquals(0, c.countNumberOfOccurrences("test"));
	  }
	
	  @Test
	  public void testCountNumberOfOccurrences_ElementInQueue() {
	      when(mq.size()).thenReturn(3);
	      when(mq.contains("test")).thenReturn(true);
	      when(mq.getAt(0)).thenReturn("test");
	      when(mq.getAt(1)).thenReturn("other");
	      when(mq.getAt(2)).thenReturn("test");
	      assertEquals(2, c.countNumberOfOccurrences("test"));
	  }
  
}
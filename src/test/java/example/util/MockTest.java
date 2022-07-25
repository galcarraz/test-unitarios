package example.util;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class MockTest {

	@Mock
	private ArrayList mockArrayList = new ArrayList<>();
	 
	@Test
	public void mockTest() {
	    mockArrayList.add("Object 1");
	    mockArrayList.add("Object 2");
	    mockArrayList.add("Object 3");
	    assertEquals(0, mockArrayList.size());
	}

}

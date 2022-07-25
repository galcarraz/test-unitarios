package example.util;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.mockito.Spy;

class SpyTest {

	@Spy
	private ArrayList spyArrayList;
	 
	@Test
	public void spyTest() {
		spyArrayList=new ArrayList<>();
	    spyArrayList.add("Object 1");
	    spyArrayList.add("Object 2");
	    spyArrayList.add("Object 3");
	 
	    assertEquals(3, spyArrayList.size());
	}
}

package m00;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchTest {

	@Test
	public void testBinarySearchCase1() {
		int testx1=1;
		int []testa1={-2,-1,0,1,2};
		
		int r1 = 3;
		
		assertEquals(r1, Search.find(testx1, testa1));	
	}
	
	@Test
	public void testBinarySearchCase2() {
		int testx2=5;
		int []testa2={-2,-1,0,1,2};
		
		int r1 = -1;
		
		assertEquals(r1, Search.find(testx2, testa2));	
	}
	
	@Test
	public void testBinarySearchCase3() {
		int testx3=-1;
		int []testa3={-2,-1,0,1,2};
		
		int r1 = 1;
		
		assertEquals(r1, Search.find(testx3, testa3));	
	}
	
	@Test
	public void testBinarySearchCase4() {
		int testx4=0;
		int []testa4={-2,-1,0,1,2};
		
		int r1 = 2;
		
		assertEquals(r1, Search.find(testx4, testa4));	
	}

	@Test
	public void testBinarySearchCase5() {
		int testx5=-1;
		int []testa5={-2,-1,-1,-1,0,0,1,2};
		
		int r1 = 1;
		
		assertEquals(r1, Search.find(testx5, testa5));	
	}



}

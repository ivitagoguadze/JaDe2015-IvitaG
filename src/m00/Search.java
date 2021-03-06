package m00;

public class Search {
	
	/**
	 * Find the first occurrence of x in sorted array a.
	 * @param x value to find
	 * @param a array sorted in increasing order (a[0] <= a[1] <= ... <= a[n-1])
	 * @return lowest i such that a[i]==x, or -1 if x not found in a.
	 */
	public static int find(int x, int[] a) {
		int rez=binarySearch(x, a, 0, a.length-1);
	
		return rez;
	
	} 
	

	public static int binarySearch(int x, int[] a, int start, int end) {
		// TODO finish implementation of binary search method
		
		int mid = (start+end) / 2;
		if(x>a[end]||x<a[start])
			return -1;
		
		if (x < a[mid]) {
			return binarySearch( x, a, start, mid);
		} else if (x > a[mid]) {
			return binarySearch( x, a, mid + 1, end);
		} else {
			return mid; // because x == a[mid], i.e. we found it!
		} 

	}
}

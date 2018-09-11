package arrays;
/*
 * Step 1: At every step, consider the array between low and high indices.
 * Step 2: Calculate the mid-index.
 * Step 3: If element is at the mid-index is the key, return mid.
 * Step 4: If the element at the mid is greater than the key, then reduce the array
 * size such that high becomes mid-1.Index low remains the same.
 * Step 5: If the mid is less than the key, then reduce the array size such that low
 * becomes mid+1.Index at high remains the same. 
 * Step 6: When low is greater than high, key doesn't exist.Return -1.
 * 
 */

//-----> Hint:- Divide and Conquer.

/*1. Run time complexity Logarithmic, O(logn).
 *2. Memory Complexity Logarithmic, O(logn).(Dis-advantage will consume memory on Stack.
*/

public class BinarySearch {
   
	// a is sorted array. 
	static int bin_search(int[] A, int key){
		
		int low = 0;
		int high = A.length -1;
		
		while(low <= high){
			int mid = low + ((high - low) / 2);
			
			if (A[mid] == key){
				return mid;
			}
			if(key < A[mid] ){
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}
	public static void main(String [] args){
		int[] arr = {1,2,3,66,89,60,20,100,110};
		System.out.println("Key at(12) found at: "+bin_search(arr,66));
		System.out.println("Key at(12) found at: "+bin_search(arr,2));
	}
}

package applications;
/**
 * Question: 
 * For a sorted array, it might be rotated:
 * 6 7 1 2 3 4 5
 * Find the min in this case
 * 
 * solution1: normal linear search
 * 
 * solution2: binary search O(logN)
 * 
 * @author haozheng
 *
 */
public class Rotated_SortedArray {

	private int[] arr;
	public Rotated_SortedArray(int[] arr){
		this.arr = arr;
	}
	
	//algo entry
	public void getMin(int front, int rear){
		//first time, first and last compare
		if(arr[front] < arr[rear]){
			System.out.println("min: "+arr[front]);
		}else
		{
			//it is rotated
			getMinRecur(front,rear);
		}
	}
	
	
	public int getMinRecur(int front, int rear){
 
		//base case
		if(front == rear||rear-front==1)
		{
			if(arr[front] > arr[rear]){
				System.out.println("min: "+arr[rear]);
			}else{
				System.out.println("min: "+arr[front]);
			}
			
			return -1;
		}

		
		int middle = (rear+front)/2;
 
		if(arr[front] > arr[middle]){
			//min in the left part, including middle
			getMin(front,middle);
		}else{
			//right part
			getMin(middle,rear);
		}
		
		
		return -1;
	}
}

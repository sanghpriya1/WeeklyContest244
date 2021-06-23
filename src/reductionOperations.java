import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

class MaxHeap implements Comparator<Integer> {
	public int compare(Integer o1, Integer o2) {
		
		if (o1 < o2) {
    		return 1;
    	}
    	if (o1 > o2) {
    		return -1;
    	}
    	return 0;
	}
	

}
public class reductionOperations {
	
	public static void main(String[] args) {
		int[] nums = {5};
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(nums.length, new MaxHeap());
		for(int i = 0; i < nums.length; i++) {
			pq.add(nums[i]);
		}
		int operation = 0;
		while(!pq.isEmpty()) {
			int x = pq.poll();
			Stack<Integer> S = new Stack<>();
			while(pq.peek() == x) {
				S.push(pq.poll());
				if(pq.isEmpty())break;
			}
			if(pq.isEmpty())break;
			x = pq.peek();
			pq.add(x);
			while(!S.isEmpty()) {
				pq.add(S.pop());
			}
			operation++;
		}
		System.out.println(operation);
	}
}

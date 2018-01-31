
import java.util.PriorityQueue;


public class HowToUse {

	public static void main(String[] args) {
		
		PriorityQueue<Node> testQueue = new PriorityQueue<>();	
		
		
		testQueue.add(new Node("A", 1));

		testQueue.add(new Node("B", 2));

		testQueue.add(new Node("C", 3));
		testQueue.add(new Node("D", 4));
		
		
		
		 while (!testQueue.isEmpty()) {
	            System.out.println(testQueue.remove());
	        }
	
	
	} // end of main
	

}



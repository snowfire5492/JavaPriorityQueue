

public class Node implements Comparable<Node>{
		
		String name;
		int value;
		
		public Node(String name, int value) {
			this.name = name;
			this.value = value;
		}
		
		public int getValue() {
			return value;
		}
		
		public String toString() {
			String str = " ";
			str = "Name: " + name + ", value : " + value;
			return str;
		}

		@Override
		public int compareTo(Node state) {
			if(this.getValue() > state.getValue()) {
				return 1;
			} else if (this.getValue() < state.getValue()) {
				return -1;
			} else {
				return 0;
			}
		}
		
	}
	

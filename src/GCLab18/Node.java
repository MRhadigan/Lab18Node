package GCLab18;

public class Node {
	
	private String data;
	private Node next;
	
	public Node() {
		
	}
	
	public Node(String data, Node next) {
		this.data = data;
		this.next = next;
	}


	public String getData() {
		return data;
	}

	
	public void setData(String data) {
		this.data = data;
	}

	
	public Node getNext() {
		return next;
	}

	
	public void setNext(Node next) {
		this.next = next;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if(next != null) {
			return data + " -> ";
		}
		return data;
	}
	
	
	
}

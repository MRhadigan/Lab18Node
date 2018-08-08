package GCLab18;

//import com.gc.lists.Node;

public class LabLinkedList implements MyLabList {

	private Node head = null;
	private int length = 0;
	
	@Override
	public boolean removeAt(int index) {

		if (length > 0) {
			// The beginning is the end.
			removeAt(index);
		} else {
			// find the node right before the end.
			Node beforeTail = getNodeAt();
			// set its next to null. This ends the list here.
			beforeTail.setNext(null);
			length--;
		}
	
		return false;
	}

	@Override
	public boolean insertAt(int index, String s) {
		String data = null;
		if(length == 0) {
			insertAt(index, s);
		} else {
			Node tail = getNodeAt();
			tail.setNext(new Node(data, null));
			length++;
		}

	
		return false;
}


	
	public Node getNodeAt() {
		
		return head;
	}

	
	public void setNodeAt(Node head) {
		
		this.head = head;
	}

	
	public int getLength() {
		return length;
	}

	
	public void setLength(int length) {
		this.length = length;
	}

	
}

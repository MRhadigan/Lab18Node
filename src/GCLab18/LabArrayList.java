package GCLab18;

import java.util.ArrayList;



public class LabArrayList implements MyLabList {


	String[] array = new String[4];
	Node head;
	int length = 0;
//
//	private boolean isFull() {
//		return length == array.length;
	
	
	@Override
	public boolean removeAt(int index) {
		Node current = head;
		Node removeNode = new Node();
		
		for (int i = length - 1; i >= 0; i--) {

			if (i == index) {
				removeNode = current.getNext();
				current.setNext(removeNode.getNext());
				length--;
				return true;
			}
			current = current.getNext();
		}

	return false;
	}

	@Override
	public boolean insertAt(int index, String s) {
		
		// Loop backwards and shift all the items over to make room for the new one
		for (int i = length; i > 0; i--) {
			array[i] = array[i - 1];
		} 
		String data = null;
		// set first element and increment length
		array[0] = data;
		length++;

		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < length; i++) {
			sb.append(array[i]);
			if (i != length - 1) {
				sb.append(", ");
			}
		}

		sb.append(" ]");
		return sb.toString();
	}
}

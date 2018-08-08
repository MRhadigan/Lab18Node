package GCLab18;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
	
		
		//LabArrayList list = new LabArrayList();
		//list.removeAt(2);
		
		String list = " ";
		ArrayList<String> arr = Test.conTest(list);
		System.out.println(arr);
	
			
	}

	public static ArrayList<String> conTest(String list) {
		
		ArrayList<String> userNum = new ArrayList<>();
		userNum.add("1,2,3,2,2,4,5,5,7,8,4,4,1,0,10");
		
		
//		list.removeAt(0);
//		list.
//		list.addAtBeginning("C");
//		list.addAtBeginning("B");
//		list.addAtBeginning("A");

		
		System.out.println(list);
		//System.out.println(list.size());
		return userNum;
		
		
	}
}

import java.util.*;
import java.io.*;

public class Intersect {

	public static void main(String[] args) {
		
    //Example list 1
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.addAll(Arrays.asList(1, 4, 8, 9, 11, 15, 17, 28, 41, 59));
		
    //Example list 2
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.addAll(Arrays.asList(4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81));
		
		intersect(list1, list2);
		
	}

	//Function call to extract similar list objects.
	public static void intersect(ArrayList<Integer> list1,ArrayList<Integer> list2) {
		
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println();
		
		for(int i = 0; i < list1.size(); i++) {
			
			for(int j = 0; j < list2.size(); j++) {
			
				if(list1.get(i) == list2.get(j) ) {
				
				
				list3.add(list1.get(i));
				}
			}
		}

		System.out.println(list3);
	}	
}

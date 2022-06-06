import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

class starter {
	//Methods go here
	public static void printArrayList(ArrayList<Integer> arr){
		for(int x=0; x<arr.size();x++){
			System.out.println(arr.get(x));
		}
	}
	
	public static void addValuesArrayList(int n, ArrayList<Integer> arr){
		for(int y = 0; y<n;y++){
			arr.add(20);
		}
		
	}
	
	

	public static void main(String args[]) {
		// Your code goes below here
		ArrayList<Integer> boo = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("how many values do you want to add to the array?");
		int value = sc.nextInt();
		addValuesArrayList(value, boo);
		printArrayList(boo);


	}
}

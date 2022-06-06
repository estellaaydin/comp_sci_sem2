//import pkg.*;
import java.util.*;
import java.util.ArrayList;

class starter {
	
	public static void printArr (ArrayList<Integer> arr){
			for(int x = 0;x<arr.size(); x++){
				System.out.print(arr.get(x) + " ");
			}
	}
	public static void bubbleSort(ArrayList<Integer> arr){
		for(int outer = 0; outer<arr.size()-1;outer++){
			for(int inner = 0;inner<arr.size()-outer-1; inner++){
				if(arr.get(inner)> arr.get(inner+1) ){
					int temp = arr.get(inner);
					arr.set(inner,inner+1);
					arr.set(inner+1,temp);
				}
			}
		}
		for(int x=0;x<arr.size();x++){
			System.out.print(arr.get(x) + " " );
		}
	}
	
	public static void selectionSort(ArrayList<Integer> arr){
		int outer, inner, min_index;
		for(outer =0; outer<arr.size(); outer++){
			min_index=outer;
			for(inner=outer+1;inner<arr.size();inner++){
				if(arr.get(inner)<arr.get(min_index)){
					min_index=inner;
				}
			}
			int temp = arr.get(outer);
			arr.set(outer,min_index);
			arr.set(min_index,temp);
		}
		for(int x=0;x<arr.size();x++){
			System.out.print(arr.get(x) + " " );
		}
	}
	
	public static void insertionSort(ArrayList<Integer> arr){
		int outer, inner, key;
		for(outer=1;outer<arr.size(); outer++){
			key = arr.get(outer);
			inner = outer-1;
			while(inner>=0 && arr.get(inner) >key){
				arr.set(inner+1,inner);
				inner = inner-1;
			}
			arr.set(inner+1,key);
		}
		for(int x=0;x<arr.size();x++){
			System.out.print(arr.get(x) + " " );
		}
	}
	
	public static int getMedian(ArrayList<Integer> arr){
		int median = arr.size()/2;
		if(arr.size()%2 ==1){
			median = (arr.get(arr.size()/2) + arr.get(arr.size()/2-1) )/2;
		}
		else{
			median = arr.get(arr.size() / 2);
		}
		return median;
	}
	
	
	public static void main(String args[]) {
		ArrayList <Integer> boo = new ArrayList<Integer>();
	
		for(int x=0;x<100;x++){
			boo.add(x,(int)(Math.random()*100));
			//System.out.print(boo.get(x) + " " );
			//System.out.print(boo.get(x));
		}
		
		// for(int x=0;x<100;x++){
		// 	System.out.print(boo.get(x) + " " );
		// }
		//System.out.println(boo);
		
		
		System.out.println("array list: ");
		printArr(boo);
		
		/*for(int x=0;x<boo.size();x++){
			bubbleSort(boo);
			boo.get(x);
		}*/
		System.out.println();
		System.out.println("bubble sort: ");
		bubbleSort(boo);
		System.out.println();
		System.out.println("selection sort: ");
		selectionSort(boo);
		System.out.println();
		System.out.println("insertion sort: ");
		System.out.println("insertion sort: ");
		insertionSort(boo);
		System.out.println();
		System.out.println();
		System.out.println("the median is: " + getMedian(boo) );
		
	}
}

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void insertionSort(int []arr){
		int outer, inner, key;
		for(outer=1; outer<arr.length;outer++){
			key = arr[outer];
			inner = outer-1;
			while(inner>= 0 && arr[inner]>key){
				arr[inner+1] = arr[inner];
				inner = inner-1;
			}
			arr[inner+1] = key;
		}
	}
	public static void main(String args[]) {
		// Your code goes below here
		int [] arr = new int [200];
		for(int x = 0; x<arr.length; x++){
			arr[x] = (int)(Math.random()*100);
		}
		
		insertionSort(arr);
		for(int x = 0; x<arr.length;x++){
			System.out.print(arr[x] + " ");
		}


		
	}
}

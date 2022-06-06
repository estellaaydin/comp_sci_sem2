import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


class starter {
	
	public static void toStringArrayList(ArrayList<Integer>arr){
		for(int x =0; x<arr.size();x++){
			System.out.print(arr.get(x) + " " );
		}
	}	
		public static int getArrayListAverage(ArrayList<Integer>arr){
			int sum = 0;
			for(int z =0; z<arr.size(); z++){
				sum = sum + arr.get(z);
			}
			int avg = sum/arr.size();
			return avg;
		}
		
		public static int getArrayListMax(ArrayList<Integer>arr){
			int max = 0;
			for(int y =0; y<arr.size(); y++){
				if(max<arr.get(y)){
					max = arr.get(y);
				}
			}
			return max;
		}
		
		public static int getArrayListMin(ArrayList<Integer>arr){
			int min = 100;
			//to get largest possible value use: Integer.MAX_VALUE        ex: int min = Integer.Max_VALUE;
			//System.out.println(min);
			for(int w =0; w<arr.size();w++){
				//System.out.println(arr.get(w) + " and " + min);
				if(min>arr.get(w)){
					min = arr.get(w);
				}
			}
			return min;
		}
	public static void main(String args[]) {
		// Your code goes below here
		
		Scanner sc = new Scanner(System.in);
		// user chooses how many boxes you add, fill those boxes with random values
		System.out.println("how many values would you like in your array list?");
		int values = sc.nextInt();
		ArrayList<Integer> boo = new ArrayList<Integer>(values);
		for(int k =0; k<values; k++){
			boo.add(k,(int) (1+Math.random()*100) );
		}
		/*System.out.println();
		for(int j=0;j<boo.size(); j++){
			System.out.println(boo.get(j) );
		}*/
		
		toStringArrayList(boo);
		System.out.println();
		System.out.println("the average is " + getArrayListAverage(boo) );
		System.out.println("the min is " + getArrayListMin(boo) );
		System.out.println("the max is " + getArrayListMax(boo) );

		
	}
}

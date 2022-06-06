import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		ArrayList <String> arr = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("how many cookies would you like?");
		int answer = sc.nextInt();
		for(int x = 0; x<answer;x++){
			arr.add(x, "cookie");
		}
		for(int z=0;z<arr.size();z++){
			System.out.println(arr.get(z));
		}
		


		
	}
}

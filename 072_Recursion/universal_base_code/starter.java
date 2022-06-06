import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static int factorial(int n){
		if(n<=1){
			return 1;
		}
		else{
			return n*factorial(n-1);
		}
	}
	
	public static int recurPower(int base, int n){
		if(n<=0){
			return 1;	
		}
		else{
			return base*recurPower(base,n-1);
		}
	}
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();

		System.out.println(factorial(4) );
		System.out.println(recurPower(5,4) );
	}
}

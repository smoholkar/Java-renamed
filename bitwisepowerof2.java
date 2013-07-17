/**
 * @author sonalimoholkar
 * To find if a number is power of 2.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bitwisepowerof2{
	public static void main(String args[]) throws NumberFormatException, IOException{
		
		System.out.println("Enter any number:");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		System.out.println("The number that you entered is:" + num);
		
		if(num<=0){
			System.out.println("Nope number is not a power of two");
		}
		else if((num & -num)==num){
			System.out.println("Yup the number is a power of two");
		}
		else{
			System.out.println("Nope number is not a power of two");
		}
	}
}
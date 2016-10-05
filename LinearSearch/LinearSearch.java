/*Rangel Angelo C. Macapagal
  ACT-2
  DSA
 */

import java.util.Scanner;
import java.util.Random;

public class LinearSearch {
 public static void main(String[] args){
	 int i ,size,search,array[];
	 
	 Scanner in = new Scanner(System.in);
	 Random t= new Random();
	 
	 System.out.print("Enter array size: ");
	 size = in.nextInt();
	 array= new int[size];
	 
	 System.out.print("Enter number to find: ");
	 search=in.nextInt();
	 
	 for( i=0;i<size;i++){
		 array[i]=t.nextInt(1000);
	 
	 	if (array[i]==search){
	 		System.out.println("Found: "+search+"is at "+"array["+i+"]");
	 	
	 	break;
	 }	
	 	}
	 
	 if(i==size){
		 System.out.println("Not Found: "+search+" is not in the array.");
	 }
	 
	 
 }
}

/*Rangel Angelo C. Macapagal
  ACT-2
  DSA
 */

import java.util.Scanner;
public class FindMinMax {
 public static void main(String[]args){
	 Scanner in=new Scanner(System.in);
	 int [] numbers={56,53,13,56,34,89};
	 int min= Integer.MAX_VALUE;
	 int max =Integer.MIN_VALUE;
	 
	 System.out.println("This is The Numbers  >> 56,53,13,56,34,89 << \n");
	 
	 for(int i=0;i<numbers.length;i++){
		 if(min>numbers[i]){
			 min= numbers[i];
		 }
		 if(numbers[i]>max){
			 max= numbers[i];
		 }
		
	 }
	 System.out.println("Smallest Value is: "+min);
	 System.out.println("Largest Value  is: "+max);
	 
 }
}

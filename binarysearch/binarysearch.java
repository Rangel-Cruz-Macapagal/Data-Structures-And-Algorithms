package binarysearch;
import java.util.*;
	public class binarysearch {
		
		public static void main(String[]args){
		Scanner in= new Scanner(System.in);
		Random t= new Random ();
		
		int[] array = new int[10];
		int search =0,index;
		int size;
		
		System.out.println("Enter Array Size: ");
		size=in.nextInt();
		array =new int[size];
		
		for(int i=0;i<size;i++){
			array[i] = t.nextInt(1000);
			System.out.println(array[i]+" ");
		}
		System.out.print("Enter Number To be Find:");
		search=in.nextInt();
		index = binarysearch(array,search);
		if(index!= -1){
			System.out.println("Found at index " +index);
		}
		else{
			System.out.println("Not Found!!");
		}
}
	
static int binarysearch(int[]numbers,int find){
	int left, right, middle;
	left=0;
	right= numbers.length -1;
	while(left <=right){
		middle =(left +right)/2;
		if(numbers[middle]==find){
			return middle;
		}
		else if(numbers[middle] <find){ 
			left=middle+1;
		}
		else{
			right=middle-1;
		}
	}
	return-1;
}
}
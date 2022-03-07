import java.util.Scanner;

/**
 * This is a class that displays the Binary Search Algorithm
 * 
 * @author Alex Matos
 *
 */
public class Algorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] bsArray = {1,2,45,89,378,500,1000,1784,2460,3145};
		Scanner input = new Scanner(System.in);
		int nToFind;
		
		System.out.print("What number do you want to find in the array? : " );
		nToFind = input.nextInt();
		
		if (binarySearch(bsArray,nToFind) == -1) 
			System.out.println("The number " + nToFind + " was not found in the array.");
		else 
			System.out.println("The number "+ nToFind + " was found at index : " + binarySearch(bsArray,nToFind));
		
	}
	
	// Binary Search Algorithm
	public static int binarySearch(int[] a, int n) {
		int front = 0;
		int back = a.length-1;
		
		while (front < back) {
			int middle = (front + back) / 2;
			
			if (a[middle] == n)
				return middle;
			else if (a[middle] > n)
				back = middle;
			else
				front = middle;
		}
		// If number is not found return -1
		return -1;
		
	}
}

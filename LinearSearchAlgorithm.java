import java.util.Scanner;

/**
 * This is a class that displays the Binary Search Algorithm
 * 
 * @author Alex Matos
 *
 */
public class Algorithms {
  // Linear Search Algorithm
	public static int linearSearch(int[] a, int n) {
		for (int i = 0; i < a.length-1; i++)
			if (a[i] == n)
				return i;
		return -1;
	}
	
	public static void main (String[] args) {
		int[] lsArray = {1,2,45,89,378,500,1000,1784,2460,3145};
		Scanner input = new Scanner(System.in);
		int nToFind;
		
		System.out.print("What number do you want to find in the array? : " );
		nToFind = input.nextInt();
		
		if (linearSearch(lsArray,1784)  == -1)
			System.out.println("The number " + nToFind + " was not found in the array.");
		else 
			System.out.println("The number "+ nToFind + " was found at index : " + linearSearch(lsArray,nToFind));
	}
}

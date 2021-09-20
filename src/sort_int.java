import java.util.Arrays;
import java.util.Random;

public class sort_int {
	
	static int length = 10; 

// this program will create a an array of length 10 with random numbers from 1 - 10 and sorts them by ascending order
	
public static void main(String[] args) {
	
	int[] array_1 = new int[length];
	Random rand = new Random();
	for(int i = 0; i < length; i++) {
		array_1[i] = rand.nextInt(10)+1;
		System.out.print(array_1[i] + " , ");
	}
	
	System.out.println();
	
	//sort the array using array sort
	Arrays.sort(array_1);	
	for(int j = 0; j < length; j++) { 
		System.out.print(array_1[j] + " , ");
	  }
    }
}


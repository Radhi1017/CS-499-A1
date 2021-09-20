
import java.util.Arrays;
public class sort_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array_1 = {"Apple", "Orange", "Blue", "Purple", "Lilac", "Pink"};
		
		for(String element: array_1) {
			System.out.print(element + " , ");
		}
		int length = array_1.length;
		
		System.out.println();
		
		for(int i = 0; i < length; i++) {
			for(int j = i+1; j < length; j++) {
				if(array_1[i].compareTo(array_1[j])<0) {
					String temp = array_1[i];
					array_1[i] = array_1[j];
					array_1[j] = temp; 
					
				}
			}
		}
		
		System.out.print(Arrays.toString(array_1));
		
		

	}

}
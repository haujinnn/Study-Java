package array;

public class ArrayTest {

	public static void main(String[] args) {
		int[] numbers = new int[3];
		
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = i+1;
			System.out.println(numbers[i]);
		}
	}

}

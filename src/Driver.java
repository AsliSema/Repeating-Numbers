import java.util.Arrays;

public class Driver {
	
	static boolean isThere(int[] arr, int value) {
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == value) {
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		int[] numbers = {1, 33, 45, 654, 654,66, 22, 33, 98, 66, 33};
		int[] repeatedNums = new int[numbers.length];
		int index = 0;
		
		Arrays.sort(numbers);
		//System.out.println(Arrays.toString(numbers));
		
		int j = 1;
		for(int i= 0; i<numbers.length; i++) {
			if(j < numbers.length) {
				if(!isThere(repeatedNums, numbers[i]) && numbers[i] == numbers[j]) {
					repeatedNums[index] = numbers[i];
					//System.out.println(numbers[i]);
					index++;
				}
				j++;
			}
		}
		

		System.out.println(Arrays.toString(repeatedNums));
		
		for(int i = 0; i<repeatedNums.length; i++) {
			if(repeatedNums[i] != 0) {
				System.out.println(repeatedNums[i]);
			}
		}
		
	}
}

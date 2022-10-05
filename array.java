package Day3;

public class array {
	public static void main(String[] args) {

		int array[] = { 10, 20, 30, 40, 50 };
		System.out.println("Number at perticular position:" +array[1]); // print perticular element
		System.out.println("all element of array");
		for (int i = 0; i < 5; i++) { // print all element
			System.out.println(array[i]);
		}
		System.out.println("Reverse order");
		for (int i = 4; i >= 0; i--) { // print all element
			System.out.println(array[i]);
		}
		System.out.println("Even position data");
		for (int i = 0; i < 5;) { // even position data
			System.out.println(array[i]);
			i = i + 2;
		}
		System.out.println("Odd position data");
		for (int i = 1; i < 5;) { // odd position data
			System.out.println(array[i]);
			i = i + 2;
		}
		int max = array[0]; // largest number
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
		}
		System.out.println("Largest element present in given array: " + max);
		int min = array[0]; // smallest number
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min)
				min = array[i];
		}
		System.out.println("Smallest element present in given array: " + min);
		
		int temp=0; //  second largest number
		 for(int i = 0; i<array.length; i++ ){
	         for(int j = i+1; j<array.length; j++){

	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	     }
		System.out.println("Second largest element present in given array: " + temp);
		
	}
}
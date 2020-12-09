import java.util.Scanner;

public class arraysfirst {
	private Scanner input = new Scanner(System.in);
	
	
	public void display(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
	}
	
	
	public void onetoN(int n, int[] arr) {
		for(int i = 0; i < n; i++) {
			arr[i] = i+1;
		}
		
	}
	
	public void swap(int[] arr) {
		int store = arr[0];
		arr[0] =  arr[arr.length-1];
		arr[arr.length-1] = store;
		
	}
	
	public void userarray(String[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			String answer = input.next();
			arr[i] = answer;
		}
		
	
	}
	
	public void reverse(int[] arr) {
		
		for (int i = 0;j = arr.length-1;i < arr.length/2;i++, j--) {
			int store = arr[i];
			arr[i] = arr[j];
			arr[j] = store;
			
		}
		
	}
	
	
}


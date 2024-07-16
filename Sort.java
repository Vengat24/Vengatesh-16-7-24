package Zoho;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int n=obj.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = obj.nextInt();
		}
		int i=0;
		while(i<arr.length) {
			int min = arr[i];
			int minIndex = i;
				for(int j=i+2;j<arr.length;j+=2) {
					if(i%2==1)
						min = Math.min(min, arr[j]);
					else
						min = Math.max(min, arr[j]);
					if(min == arr[j])
						minIndex = j;
				}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			i++;
		}
		for(int num : arr) {
			System.out.print(num + " ");
		}

	}

}

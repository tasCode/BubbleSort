package com.michael;

import java.util.Arrays;

public class BubbleSortingDemo {
	public static void main(String[] args) {
		int[] arr = {3, 9, -1, 10, -2};
		System.out.println("≈≈–Ú«∞£∫"+Arrays.toString(arr));
		getBubbleSort(arr);
	}
	public static void getBubbleSort(int[] arr) {
		boolean flag = false;
		int temp = 0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					flag = true;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			if(!flag) {
				break;
			}else {
				flag = false;
			}
		}		
		System.out.println("≈≈–Ú∫Û£∫"+Arrays.toString(arr));
	}
}

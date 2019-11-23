package com.dsa.sort.selection;

import java.util.Scanner;

public class SelectionSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i < n; i++){
			a[i] = input.nextInt();
		}
		
		input.close();
		selectionSort(a);
	}

	private static void selectionSort(int[] a) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<a.length-1; i++){
			int min = i;
			for(int j=i;j<a.length;j++){				
				if(a[j] < a[min]){
					min = j;					
				}						
			}
			
			if(i != min){
				int temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			}

			
			for(int k=0; k<a.length;k++)
				System.out.print(a[k]+" ");
			
			System.out.println();
		}
		
	}

}

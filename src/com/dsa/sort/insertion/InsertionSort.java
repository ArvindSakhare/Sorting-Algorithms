package com.dsa.sort.insertion;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i < n; i++){
			a[i] = input.nextInt();
		}
		
		input.close();
		sort(a);
		//insertionSort1(a.length, a);

	}

	private static void sort(int[] a) {
		// TODO Auto-generated method stub
		for(int i=1; i<a.length; i++){
			int temp = a[i];
			int j =i-1;
			
			while(j>=0 && a[j]> temp){
				a[j+1] = a[j];
				j--;
			}	
			
			a[j+1] = temp;
			
			for(int k=0; k<a.length; k++)
				System.out.print(a[k]+" ");
			
			System.out.println();
			
		}
		
	}
	
	private static void insertionSort1(int n, int[] arr) {
     
        for(int i=1; i<n; i++){
            
                int temp = arr[i];
                int j=i-1;

                while(j>=0  && arr[j]>temp ){
                    arr[j+1] = arr[j];                 
                    j--;                    

                    for(int k=0; k<n; k++)
                    System.out.print(arr[k]+" ");

                    System.out.println();
                }

                arr[j+1] = temp;                     

        }
        
        for(int k=0; k<n; k++)
        System.out.print(arr[k]+" ");
        
        System.out.println();


    }

}

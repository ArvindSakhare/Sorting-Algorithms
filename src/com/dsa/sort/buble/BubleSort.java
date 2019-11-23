package com.dsa.sort.buble;

import java.util.Scanner;

public class BubleSort {

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
		
	}

	private static void sort(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0; i<a.length; i++){
			int temp =0;
			boolean flag = false;
			for(int j=0; j<a.length -1-i; j++){
				if(a[j+1] < a[j]){
					flag = true;
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			
			
			for(int k=0; k<a.length; k++)
				System.out.print(a[k]+" ");
			System.out.println();
			
			if(flag == false){
				break;
			}
			
		}
		
	}

}

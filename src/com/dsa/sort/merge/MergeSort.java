package com.dsa.sort.merge;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i < n; i++){
			a[i] = input.nextInt();
		}
		
		input.close();
		mergesort(a,0,(a.length-1));
		
		for(int p=0; p<a.length;p++){
			System.out.println(a[p]);
		}
		

	}

	private static void mergesort(int[] a, int lb, int ub) {
		// TODO Auto-generated method stub
		if(lb<ub){
		int mid = (lb +ub)/2;
		mergesort(a, lb,mid);
		mergesort(a,(mid+1), ub);
		merge(a,lb,mid,ub);
		}
		
	}

	private static void merge(int[] a, int lb, int mid, int ub) {
		// TODO Auto-generated method stub
		int i=lb;
		int j= mid+1;
		int k= lb;
		int[] b = new int[a.length];
		while(i<=mid && j<=ub){
			if(a[i] <= a[j]){
				b[k] = a[i];
				i++;
			}else{
				b[k] = a[j];
				j++;
			}
			
			k++;
		}
		
		if(i> mid){
			while(j<=ub){
				b[k] = a[j];
				j++;
				k++;
			}
		}else{
			while(i<=mid){
				b[k] = a[i];
				i++;
				k++;
			}
		}
		
		for(k=lb; k<=ub;k++){
			a[k] = b[k];
		}
		
	}



}

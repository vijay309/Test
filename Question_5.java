package test;

import java.util.Arrays;
import java.util.Scanner;

public class Question_5{
	public static boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int min=0;
	int[] arr=new int[n];
	
		int[] arr1=new int[n];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
	}
		for(int i=0;i<arr.length;i++) {
			if(isPrime(arr[i])) {
				arr1[j]=arr[i];
				j++;
			}
		}
		min=arr1[0];
		for(int i=0;i<arr1.length;i++){
			if(arr1[i]!=0) {
				if(arr1[i]<min) {
					min=arr1[i];
				}
			}
		}
		
		
	System.out.println(min);
		int sum=0;
		for(int i=0;i<arr1.length;i++) {
			
			
			sum=sum+arr1[i];
			
		}
		System.out.println("Sum is:"+(sum-min));
		

	}

}

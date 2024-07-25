package test;

import java.util.Arrays;
import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int c1=n;
		char c='a';
		char ch[]=new char[c1];
		for(int i=0;i<c1;i++) {
			ch[i]=c;
			c++;
			}
		int[] arr1=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=arr[i];
		}
		
		Arrays.sort(arr1);
		char[] ch2=new char[n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr1[i]==arr[j]) {
					ch2[j]=ch[i];
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(ch2[i]);
		}
	

	}

}

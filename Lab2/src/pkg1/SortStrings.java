package pkg1;

import java.util.Arrays;
import java.util.Scanner;

public class SortStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortStrings ss=new SortStrings();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] arr=new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
		}
		ss.sortStrings(arr, n);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		//System.out.println(ss.sortStrings(arr,n));
	}
	String[] sortStrings(String[] arr,int n) {
		Arrays.sort(arr);
		if(n%2==0) {
		for(int i=0;i<n/2;i++) {
			arr[i]=arr[i].toUpperCase();
		}
		for(int i=n/2;i<n;i++)
		{
			arr[i]=arr[i].toLowerCase();
		}
		}
		else
		{
			for(int i=0;i<(n/2)+1;i++) {
				arr[i]=arr[i].toUpperCase();
			}
			for(int i=(n/2)+1;i<n;i++)
			{
				arr[i]=arr[i].toLowerCase();
			}
		}
		return arr;
	}

}

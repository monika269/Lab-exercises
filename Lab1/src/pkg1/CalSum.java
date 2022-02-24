package pkg1;

import java.util.*;
public class CalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalSum calsum=new CalSum();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(calsum.calculateSum(n));
		

	}
	int calculateSum(int n) {
		//Calculate sum
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%5==0 || i%3==0)
			{
				sum+=i;
			}
		}
		return sum;
	}

}

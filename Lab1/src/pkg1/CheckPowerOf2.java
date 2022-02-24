package pkg1;
import java.util.*;

import java.util.Scanner;

public class CheckPowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckPowerOf2 check=new CheckPowerOf2();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(check.checkNumber(n));
	}
	boolean checkNumber(int n) {
		if(n==0)
			return false;
		while(n!=1) {
			if(n%2!=0)
				return false;
			n=n/2;
		}
		return true;
	}

}

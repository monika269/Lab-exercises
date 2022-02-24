package pkg1;

import java.util.Scanner;

public class NameException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String fname=sc.nextLine();
		String lname=sc.nextLine();
		try {
			if(fname==null && lname==null) {
				throw new Name1("Name should not be blank");
			}
			else
			{
				System.out.println("Success");
			}
		}
		catch(Name1 a) {
			System.out.println(a);
		}
	}

}

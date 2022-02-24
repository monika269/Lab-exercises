package pkg1;
import java.util.*;

public class AgeException {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		try {
			if(age<15) {
				throw new Age("Invalid age");
			}
			else
			{
				System.out.println("Valid age");
			}
		}
		catch(Age a) {
			System.out.println(a);
		}
	}

}

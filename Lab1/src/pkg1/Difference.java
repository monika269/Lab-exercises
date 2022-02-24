package pkg1;
import java.util.*;

public class Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Difference diff=new Difference();
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		System.out.println(Math.abs(diff.calculateDifference(n)));
	}
	int calculateDifference(int n) {
		int sum1=0,sum2=0;
		for(int i=1;i<=n;i++)
		{
			sum1=sum1+(i*i);
			sum2+=i;
		}
		return sum1-(sum2*sum2);
	}
}

package pkg1;
import java.util.*;

public class SecondSmallest {
	public static void main(String[] args) {
		SecondSmallest ss=new SecondSmallest();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(ss.getSecondSmallest(n,arr));
	}
	int getSecondSmallest(int n,int arr[]) {
		Arrays.sort(arr);
		return arr[1];
	}
}

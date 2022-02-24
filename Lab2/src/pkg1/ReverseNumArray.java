package pkg1;
import java.util.*;

public class ReverseNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseNumArray ra=new ReverseNumArray();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		ra.getSorted(n,arr);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	int[] getSorted(int n,int[] arr) {
		for(int i=0;i<n;i++) {
			String str=Integer.toString(arr[i]);
			StringBuilder sb=new StringBuilder(str);
			sb.reverse();
			int var=Integer.parseInt(sb.toString());
			arr[i]=var;
		}
		Arrays.sort(arr);
		return arr;
	}

}

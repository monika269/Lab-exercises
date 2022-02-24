package pkg1;
import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicates rd=new RemoveDuplicates();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		//Arrays.sort(arr);
		rd.modifyArray(n,arr);
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	int[] modifyArray(int n,int[] arr) {
		int j=0;
		int[] temp=new int[n];
		for(int i=0;i<n-1;i++)
		{
			for(int k=i+1;k<n;k++) {
			if(arr[i]!=arr[k]) {
				temp[j++]=arr[i];
			}
			}
		}
		temp[j++]=arr[n-1];
		Arrays.sort(temp);
		return temp;
	}

}

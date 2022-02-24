package pkg1;
import java.util.*;

public class SecondSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondSmall ss=new SecondSmall();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(ss.getSecondSmallest(arr));
	}
	public int getSecondSmallest(int[] arr) {
		ArrayList<Integer> list=new ArrayList<>();
		for(int i:arr) {
			list.add(i);
		}
		Collections.sort(list);
		return list.get(1);
	}

}

package pkg1;
import java.util.*;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise7 ex=new Exercise7();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(ex.getSorted(arr)));
	}
	public int[] getSorted(int[] arr) {
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			String str=Integer.toString(arr[i]);
			StringBuilder sb=new StringBuilder(str);
			String str1=sb.reverse().toString();
			list.add(Integer.parseInt(str1));
		}
		Collections.sort(list);
		int[] arr1=new int[list.size()];
		for(int i=0;i<list.size();i++) {
			arr1[i]=list.get(i);
		}
		return arr1;
		
		
	}

}

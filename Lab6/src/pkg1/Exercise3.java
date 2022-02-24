package pkg1;
import java.util.*;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exercise3 ex=new Exercise3();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(ex.getSquares(arr));
	}
	public HashMap<Integer,Integer> getSquares(int[] arr){
		HashMap<Integer,Integer> hashMap=new HashMap<>();
		for(int num:arr) {
			hashMap.put(num, num*num);
		}
		return hashMap;
	}

}

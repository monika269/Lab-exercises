package pkg1;
import java.util.*;
import java.util.Map.Entry;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exercise4 ex=new Exercise4();
		Scanner sc=new Scanner(System.in);
		//HashMap
		HashMap<Integer,Integer> hashMap1=new HashMap<>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int reg=sc.nextInt();//registration number
			int marks=sc.nextInt();//marks
			hashMap1.put(reg, marks);
		}
		System.out.println(ex.getStudents(hashMap1));
	}
	public HashMap<Integer,String> getStudents(HashMap<Integer,Integer> hashMap1){
		HashMap<Integer,String> hashMap2=new HashMap<Integer,String>();
		for(Entry<Integer, Integer> entry:hashMap1.entrySet()) {
			int m=entry.getValue();//marks
			if(m>=90)
			{
				hashMap2.put(entry.getKey(), "Gold");
			}
			else if(m>=80 && m<90) {
				hashMap2.put(entry.getKey(), "Silver");
			}
			else if(m>=70 && m<80) {
				hashMap2.put(entry.getKey(), "Bronze");
			}
		}
		return hashMap2;
	}

}

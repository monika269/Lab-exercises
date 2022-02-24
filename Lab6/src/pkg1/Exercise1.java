package pkg1;
import java.util.*;
import java.util.Map.Entry;
import java.lang.*;

public class Exercise1 {

	public static void main(String args[]) {
		Exercise1 ex=new Exercise1();
		
		HashMap<Integer,Integer> hashMap=new HashMap<Integer,Integer>();
		hashMap.put(1, 10);
		hashMap.put(2, 30);
		hashMap.put(3, 50);
		hashMap.put(4, 20);
		hashMap.put(5, 40);
		System.out.println(ex.getValues(hashMap));
	}
	//sort method
	public List<Map.Entry<Integer, Integer>> getValues(HashMap<Integer,Integer> hashMap){
		//List<Integer> list=new ArrayList<>();
		List<Entry<Integer,Integer>> list=new LinkedList<Entry<Integer,Integer>>(hashMap.entrySet());
		Collections.sort(list,new Comparator<Entry<Integer,Integer>>
		()
		{
			public int compare(Entry<Integer,Integer>o1,Entry<Integer,Integer>o2) {
			return o1.getValue().compareTo(o2.getValue());
		}
		});
		return list;
	}
	
}

package pkg1;
import java.util.*;

public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CharCount cc=new CharCount();
		char[] arr= {'a','b','c','a','d','c','a'};
		System.out.println(cc.countChars(arr));
		
	}
	public Map<Character,Integer> countChars(char[] arr){
		HashMap<Character,Integer> hashMap=new HashMap<>();
		for(char ch:arr) {
			if(hashMap.containsKey(ch)) {
				hashMap.put(ch, hashMap.get(ch)+1);
			}
			else
				hashMap.put(ch, 1);
		}
	/*	for(Map.Entry entry: hashMap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}*/
		return hashMap;
	}

}

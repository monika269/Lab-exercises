package pkg1;
import java.util.*;

public class ReplaceConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReplaceConsonant rc=new ReplaceConsonant();
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(rc.alterString(str));
	}
	String alterString(String str) {
		String str1="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' && ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U')
			{
				ch=(char)(ch+1);
			}
			str1+=ch;
		}
		return str1;
	}

}

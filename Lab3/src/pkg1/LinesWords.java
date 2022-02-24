package pkg1;
import java.util.*;

public class LinesWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinesWords lw=new LinesWords();
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int lines=1,word=1,chars=1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='\n')
			{
				lines++;
			}
			else if(str.charAt(i)==' ')
			{
				word++;
			}
			else 
				chars++;
		}
		System.out.println(lines+" "+word+" "+chars);
	}

}

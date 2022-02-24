package pkg1;
import java.util.*;

public class MirrorImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MirrorImage mi=new MirrorImage();
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(mi.getImage(str));
	}
	String getImage(String str) {
		StringBuffer sb=new StringBuffer(str);
		return str+"|"+sb.reverse();
	}
}

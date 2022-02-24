package pkg1;

interface Intf2{
	String space(String str);
}

public class SpaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Intf2 ss=(String str) -> {
			String s="";
			for(int i=0;i<str.length();i++) {
				s=s+str.charAt(i)+" ";
			}
			return s;
		};
		System.out.println(ss.space("CGI"));
	}

}

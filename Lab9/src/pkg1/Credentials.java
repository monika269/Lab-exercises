package pkg1;

interface Intf3{
	boolean verify(String user,String pw);
}

public class Credentials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intf3 i3=(String user,String pw) -> {
			if(user.equals("ABCD") && pw.equals("123@")) {
				return true;
			}
			return false;
		};
		System.out.println(i3.verify("ABCD","123@"));
	}

}

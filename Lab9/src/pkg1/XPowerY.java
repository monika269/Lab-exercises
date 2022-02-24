package pkg1;

interface Intf1{
	int xPowerY(int x,int y);
}

public class XPowerY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intf1 i=(int x,int y) -> (int)( Math.pow(x, y));
		System.out.println(i.xPowerY(2,5));
	}

}

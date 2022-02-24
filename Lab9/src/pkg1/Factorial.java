package pkg1;
import java.util.function.Function;


public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Integer> x = (num) -> {
			int fact=1;
			for(int i=1;i<=num;i++) {
				fact*=i;
			}
			return fact;
		};
		System.out.println(x.apply(5));
	}

}

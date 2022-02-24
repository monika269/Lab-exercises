package pkg1;

import java.util.*;

public class DateAndTime extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			while(true) {
				try {
					sleep(10000);
					System.out.println(new Date());
				}
				catch(Exception e) {
					System.out.println(e);
				}
		}
	}

}

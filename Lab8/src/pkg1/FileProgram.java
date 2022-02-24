package pkg1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileProgram extends Thread {

	public static void main(String args[]) throws InterruptedException, IOException {
		FileProgram t1=new FileProgram();
		t1.start();
		FileInputStream fread=new FileInputStream("C:\\Users\\MPOTHIRE\\Desktop\\Source.txt");
		FileOutputStream fwrite=new FileOutputStream("C:\\Users\\MPOTHIRE\\Desktop\\Target.txt");
		int ch=0,j=0;
		while((ch=fread.read())!=-1) {
			fwrite.write(ch);
			j++;
			if(j%10==0)
			{
				System.out.println("10 chars are copied");
			}
			t1.sleep(500);
		//	fread.close();
		//	fwrite.close();
		}
		fread.close();
	}
}

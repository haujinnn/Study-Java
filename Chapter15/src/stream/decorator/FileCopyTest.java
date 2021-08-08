package stream.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {
		long milliseconds = 0;

		try( FileInputStream fis = new FileInputStream("a.exe");
				FileOutputStream fos = new FileOutputStream("b.exe")){
			milliseconds = System.currentTimeMillis();
			int i;
			while((i=fis.read())!=-1) {
				fos.write(i);
			}
			milliseconds = System.currentTimeMillis() - milliseconds;
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println();
	}
}

package fileSpace;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class BufferDemo {
	public static void main(String args[]) throws FileNotFoundException {
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\windows\\Desktop\\WorkSpace\\Hello\\hello.txt");
			String s = "Hello Hai";
			byte b[] = s.getBytes();// converting string into byte array
			fout.write(b);
			fout.close();
			System.out.println("Success");
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\windows\\Desktop\\WorkSpace\\Hello\\hello.txt");
			int i = 0;
			while ((i = fin.read()) != -1) {
				System.out.println((char) i + " ");
			}
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		FileReader fr = new FileReader("C:\\Users\\windows\\Desktop\\WorkSpace\\Hello\\hello.txt");
		int i;
		try {
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

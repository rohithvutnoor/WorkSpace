package fileSpace;

import java.io.File;
import java.io.IOException;

public class initialFunctions {

	public static void main(String[] args) throws IOException {
		String dir = "C:\\Users\\windows\\Desktop\\WorkSpace\\Hello\\hello.txt";
		File f = new File(dir);

		/*
		 * if(f.exists()) { System.out.println("Directory Exists: "+dir); }else{
		 * f.mkdirs(); System.out.printf("Directory Created %s.", dir); }
		 */
		// f.createNewFile();
		System.out.println("Absolute Path: " + f.getAbsolutePath());
		System.out.println("File Name: " + f.getName());
		System.out.println("Parent File: " + f.getParentFile());
		System.out.println("Free Space: " + f.getFreeSpace());
		System.out.println("Parent: " + f.getParent());
		System.out.println("Is Directory: " + f.isDirectory());
		System.out.println("Is File: " + f.isFile());
		System.out.println("Can Read: " + f.canRead());
		System.out.println("Can Write: " + f.canWrite());
		System.out.println("Length: " + f.length());

	}

}

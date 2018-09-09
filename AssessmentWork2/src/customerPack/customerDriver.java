package customerPack;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class customerDriver {

	public static void main(String[] args) throws IOException {
		
		Scanner s = new Scanner(System.in);
		ArrayList<customer> cList = new ArrayList<customer>();
		customer []c = new customer[3] ;//= new customer[3];
		c[0] = new customer("rohith","vutnoor","60-H","Gachibowli","Hyderabad","Telanagana");
		c[1] = new customer("prakash","sarla","60-A","Dargah","Hyderabad","Telanagana");
		c[2] = new customer("raj","kiran","60-B","Madhapur","Hyderabad","Telanagana");
		
		//System.out.println(c[0].fname);
		
		String file = "C:\\Users\\windows\\Desktop\\WorkSpace\\data.ser";
		
		FileOutputStream fo = new FileOutputStream(file);
		ObjectOutputStream out = new ObjectOutputStream(fo);
		out.writeObject(c[0]);
		out.close();
		fo.close();
		
		s.close();
	}

}

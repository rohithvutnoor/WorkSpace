import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class product implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id = 1;
	private String pName = "Apple";
	private int price = 100;
	private transient int discount = 10;
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		
		String filePath = "C:\\Users\\windows\\Desktop\\WorkSpace\\Hello\\out.txt";
		
		
		FileOutputStream fs = new FileOutputStream(filePath);
		
		product objectIn = new product();
		
		@SuppressWarnings("resource")
		ObjectOutputStream oStream = new ObjectOutputStream(fs);
		
		oStream.writeObject(objectIn);
		
		
		
		FileInputStream fin = new FileInputStream(filePath);
		
		ObjectInputStream ob = new ObjectInputStream(fin);
		
		product objectOut = (product)ob.readObject();
		
		System.out.println("Product Name: "+objectOut.pName);
		System.out.println("Product Id: "+objectOut.id);
		System.out.println("Product Price: "+objectOut.price);
		System.out.println("Discount: "+objectOut.discount);
		ob.close();
	}
}

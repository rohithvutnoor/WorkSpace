import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class resourceAuto implements AutoCloseable {

	public void Greet() {
		System.out.println("Hello Rohith Vutnoor");
	}

	@Override
	public void close() throws Exception {
		System.out.println("AutoClosable Closed!");
	}

	private static void printFile() throws IOException {

		try (FileInputStream input = new FileInputStream("file.txt");
				BufferedInputStream bufferedInput = new BufferedInputStream(input)) {

			int data = bufferedInput.read();
			while (data != -1) {
				System.out.print((char) data);
				data = bufferedInput.read();
			}
		}
	}

	public static void main(String[] args) throws Exception {
		try (resourceAuto res = new resourceAuto()) {
			res.Greet();
		} catch (Exception r) {
			System.out.println("Error: " + r);
		}
	}

}

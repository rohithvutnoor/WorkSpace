package ioWorks;

import java.io.Console;
import java.util.Date;

public class consoleWork extends Object{
	public static void main(String[] args) {
		Console con = System.console();
		if(con!=null) {
			con.printf("Hello at %s. Please tell me your name: ", new Date());
			
			String name = con.readLine();
			String nat = con.readLine("Thanks %s, now tell me your nationality:", name);
			char[] pwChars = con.readPassword("Great %s, yopu're %s! Password? ", name, nat);
			String password = new String(pwChars);
			con.printf("Thanks, Your password is: %s", password);
		}else {
			System.out.println("Sorry, Console Unavailable");
		}
	}
}

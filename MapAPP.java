package MapAPP;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class MapAPP {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		Map<String,String> password = new HashMap<>();
		password.put("Bob","yxrt64");
		password.put("Jim","uews32");
		password.put("Rob","uitp21");
		password.put("Moe","lkjh09");
		password.put("Dom","bhng09");
		Map<String,String> phrase = new HashMap<>();
		phrase.put("Bob", "Go to sleep");
		phrase.put("Jim", "Charge your phone");
		phrase.put("Rob", "Leave me alone");
		phrase.put("Moe", "Enough already");
		phrase.put("Dom", "Last chance");
		System.out.print("Enter your username:");
		String username=userinput.nextLine();
		System.out.print("Enter your password:");
		String pass=userinput.nextLine();
		if (password.get(username).equals(pass)) {
			System.out.print("Welcome, " + username+"\nHere is your message:\n");
			System.out.println(phrase.get(username));
		}
		else {
			System.out.println("The username or password you entered is incorrect.");
		}
	}

}

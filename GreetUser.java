import java.util.Scanner; 

public class GreetUser {  

	public static void main(String args[]) {  

		String name; 
		Scanner read = new Scanner(System.in);
		System.out.println("Enter your name: ");
		name = read.nextLine(); 
		System.out.println("Hello " + name); 

	} 
} 








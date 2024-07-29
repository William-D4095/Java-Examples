import java.util.Scanner;

public class WriteAnInputWordBackwards {
	public static void main(String[] args) {
		System.out.println("Please enter a random word for the system to write backwards:");
		Scanner sc = new Scanner(System.in);
		//System.out.println(sc.nextLine());
		String s = sc.nextLine();
		char[] c = s.toCharArray();
		String t = "";
		for(int i = c.length-1; i >= 0; i--) {
			t += c[i];
			System.out.println(t);
}
		System.out.println(t);
	}
}
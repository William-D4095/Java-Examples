import java.util.Scanner;

public class LargestToSmallestNumbers {
	public static void main(String[] args) {
		System.out.println("Please enter an integer:");
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("Please enter another integer:");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println("Please enter a final integer:");
		int c = Integer.parseInt(sc.nextLine());
		System.out.println("Here's all of the numbers that you have just entered from largest to smallest!")
		if a > b and b > c and c < a:
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		if a > c and c > b and b < a:
			System.out.println(a);
			System.out.println(c);
			System.out.println(b);
		if b > a and a > c and c < b:
			System.out.println(b);
			System.out.println(a);
			System.out.println(c);
		if b > c and c > a and a < b:
			System.out.println(b);
			System.out.println(c);
			System.out.println(a);
		if c > a and a > b and b < c:
			System.out.println(c);
			System.out.println(a);
			System.out.println(b);
		if c > b and b > a and a < c:
			System.out.println(c);
			System.out.println(b);
			System.out.println(a);
}
}

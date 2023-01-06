package question1;
import java.util.Scanner;

public class GreatestNumber extends comparison{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		comparison p = new comparison();
		p.a = sc.nextInt();
		p.b = sc.nextInt();
		p.c = sc.nextInt();
		String output = p.compare();
		System.out.println(output + "is the solution");
	}
}
package securerandomnumbergeneration;
import java.security.*;

public class RandomIntegers {
	public static void main(String[] args) {
		SecureRandom randomnumbers= new SecureRandom();
		
		for (int i=1;i<=20;i++) {
			int face = 1+randomnumbers.nextInt(6);
			System.out.print(face);
			if(i%5==0) {
				System.out.println();
			}
		}
	}
}


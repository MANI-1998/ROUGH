package rough;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) throws Throwable  {
		System.out.println("enter the age");
		Scanner sc = new Scanner(System.in);

		int age = sc.nextInt();
		
		Thread.sleep(age);
		
		Thread.sleep(age);
		
		
		
		
		if (age>=18) {
			System.out.println("elegible to drive");
		}else {
			throw new NullPointerException ("not elegile to drive");
		}

	}

}

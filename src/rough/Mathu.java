package rough;

import java.util.Scanner;

public class Mathu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String stud;
		int id;
		int m1 ;
		int m2 ;
		int m3 ;
		int m4 ;
		int m5 ;
		double sum ;
		double average ;
		System.out.println("Enter the student name");
		String stud = sc.next();
		System.out.println("Enter the student Id");
		id=sc.nextInt();
		System.out.println("Enter the mark 1");
		m1=sc.nextInt();
		System.out.println("Enter the mark 2");
		m2=sc.nextInt();
		System.out.println("Enter the mark 3");
		m3=sc.nextInt();
		System.out.println("Enter the mark 4");
		m4=sc.nextInt();
		System.out.println("Enter the mark 5");
		m5=sc.nextInt();
		sum=m1+m2+m3+m4+m5;
		System.out.println("total"+sum);
		double avg = sum/5;
		System.out.println("average"+avg);
		

	}

}

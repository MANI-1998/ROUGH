package rough;

public class Rough_1 {

	public static void main(String[] args) {

		String s1 = "java";
		System.out.println(System.identityHashCode(s1));

		String s2 = "java";
		System.out.println(System.identityHashCode(s2));
		
		s1=s1+s2;
		System.out.println(s1);
		
		System.out.println(System.identityHashCode(s1));
		
		
		StringBuffer s3 = new StringBuffer ("PYTHON");
		System.out.println(System.identityHashCode(s3));
		
		StringBuffer s4 = new StringBuffer ("PYTHON");
		System.out.println(System.identityHashCode(s4));
		
		StringBuffer append = s3.append(s4);
		System.out.println(append);
		System.out.println(System.identityHashCode(append));
		
		StringBuffer reverse = s3.reverse();
		System.out.println(reverse);

	}
}

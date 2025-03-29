package JavaProgramInterviewPreparations;

public class SwapStringUsingTemp {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "world";
		String temp ="";
		temp = s1;
		s1 =s2;
		s2 =temp;
		System.out.println(s1);
		System.out.println(s2);
		
		//swap two numbers
		
		int a  = 10;
		int b = 20;
		int temp1;
		temp1 = a;
		a = b;
		b = temp1;
		System.out.println(a);
		System.out.println(b);
		
		
	}

}

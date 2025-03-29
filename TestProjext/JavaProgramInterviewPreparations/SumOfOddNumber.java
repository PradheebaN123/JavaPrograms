package JavaProgramInterviewPreparations;

import java.util.Scanner;

public class SumOfOddNumber {
	public static void main(String[] args) {
		

	int c = 0;
	Scanner sc = new Scanner(System.in);
	int intValu = sc.nextInt();
	
	 for (int i =0; i <=intValu; i++) {
		 if (i % 2 == 1) {
			 c = c+i;
		 }
		 
		 
	 }
	 
	 System.out.println("Sum of odd number:" + c);
}

}

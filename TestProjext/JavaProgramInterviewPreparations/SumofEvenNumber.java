package JavaProgramInterviewPreparations;

public class SumofEvenNumber {
	public static void main(String[] args) {
		int c = 0;
		 for (int i =0; i <=100; i++) {
			 if (i % 2 == 0) {
				 c = c+i;
			 }
			 
			 
		 }
		 
		 System.out.println("Sum of even number:" + c);
	}

}

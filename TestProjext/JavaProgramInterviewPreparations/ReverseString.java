package JavaProgramInterviewPreparations;

public class ReverseString {
	public static void main(String[] args) {
		String text ="automationvalue";
		char[] value = text.toCharArray();
		String reverse ="";
		for (int i=text.length()-1;i>=0;i--) {
			reverse = reverse + value[i];
		}
		
		System.out.println(reverse);
	}

}

package JavaProgramInterviewPreparations;

public class CountofNonSpaceCharacter {
	public static void main(String[] args) {
		String s = "This is a String";
	   int count = 0;
	   char[] ch = s.toCharArray();
	   for(int i =0 ; i<s.length();i++) {
		   if (ch[i] != ' ') {
			   count++;
			   }
		   }
	   
	   System.out.println(count);
	}

}

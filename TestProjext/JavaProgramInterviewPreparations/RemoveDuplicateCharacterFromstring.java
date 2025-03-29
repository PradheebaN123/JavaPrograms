package JavaProgramInterviewPreparations;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharacterFromstring {
	
	public static String removeDuplicatevalues (String inputString){
	//public static void main(String[] args) {
		
	
	
		
		String value = "testing";
		char[] rem = value.toCharArray();
		
		LinkedHashSet<Character> uniqueValue = new LinkedHashSet<>();
		for (char characters : rem) {
			if (!uniqueValue.contains(characters)) {
				uniqueValue.add(characters);
			}
			
		}
		System.out.println(uniqueValue);
		
		StringBuilder result = new StringBuilder();
         for(char chara : uniqueValue) {
			result.append(chara);
			
		}
		return result.toString();
		
		
		
	}
	
	public static void main(String[] args) {
		String inputString = "Pradheeba";
		String removeDuplicateResults = removeDuplicatevalues(inputString);
		System.out.println(removeDuplicateResults);
		
		
	}

}

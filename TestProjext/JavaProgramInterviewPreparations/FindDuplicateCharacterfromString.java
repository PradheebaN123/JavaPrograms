package JavaProgramInterviewPreparations;

public class FindDuplicateCharacterfromString {
	
		public static void main(String[] args) {
			
			String value = "interview";
			char[] s = value.toCharArray();
			boolean isNotDuplicate = false;
			for (int i =0; i<value.length(); i++) {
				boolean isDuplicate = false;
				for (int j=i+1; j<value.length();j++) {
					if (s[i]== s[j]) {
						
						isDuplicate = true;	
						break;
						
					}
				}
				
				if(isDuplicate) {
					System.out.println("Duplicate character in string:" + s[i]);
					isNotDuplicate = true;
					
				}
			}
			
			if(!isNotDuplicate) {
				System.out.println("No Duplicate value found");
			}
		
			}
			
			
			
		}
		

	


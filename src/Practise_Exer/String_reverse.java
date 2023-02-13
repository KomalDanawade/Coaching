package Practise_Exer;

public class String_reverse {

	public static void main(String[] args) {
	
		String str = "Komal is super boy";
		 str = str +" ";
	        for (int i = 1; i < str.length(); i++) {
	 
	            // If current character is a space
	            if (str.charAt(i) == ' ')
	 
	                // Then previous character must be
	                // the last character of some word
	                System.out.print(str.charAt(i-1)+" ");
	           // break;
	        }
	    }
	 
	}



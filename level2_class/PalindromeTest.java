//create a PalindromeChecker class
class PalindromeChecker{
    String text;
	
	
	//constructor to intialize the attributes
	
	PalindromeChecker(String text){
        this.text = text;
        
    }
	
     // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String reversedText = "";
		
        // Reverse the text
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText += text.charAt(i);
        }
        
        // Compare the original text with the reversed text
        return text.equals(reversedText);
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
}
 public class PalindromeTest{  
  // main method 
	public static void main(String[] args){

		//create a Student objects
		PalindromeChecker check1= new PalindromeChecker( "madam" );
		PalindromeChecker check2= new PalindromeChecker( "Hello");

		


		// display the result of Student
		
		check1.displayResult();
		
		check2.displayResult();
		


	}
}

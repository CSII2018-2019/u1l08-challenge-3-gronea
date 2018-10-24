import javax.swing.JOptionPane;

public class U1L08Challenge3 {

	public static void main(String[] args) {
		//Take a string
		String word = JOptionPane.showInputDialog("Write your word: ");
		//TESTING INPUT: String word = "palidrome";
		//Convert to an array of characters
		char [] charArray = word.toCharArray();
		
		//print to check
		for (int i = 0; i < charArray.length; i++) {
			System.out.println("Array: " + charArray[i]);
		}
		//create an outside variables of length for while loop
		int matcher = charArray.length;
		int x = 0;
		while (x < (charArray.length)/2) {
			//make an easy to use variable for the last letters it needs to match
			matcher -= 1;
			//tell the user what letters don't match and end code
			if (charArray[x] != charArray[matcher]) {
				System.out.println("The letter: " + charArray[x] + " and the letter: " 
						+ charArray[matcher] + " matches. \nThe word '" + word + "' is NOT a palidrome ");
				//break the code if it doesn't match because once it is wrong once it doesn't need to keep going
				break;
			//tell the person that that the letters do match
			}else {
				System.out.println("The letter: " + charArray[x] + " and the letter: " 
						+ charArray[matcher] + " matches.");
			}
			x++;
			//Say it is a palidrome (said only once)
			if (x == (charArray.length)/2) {
			System.out.println("The '" + word + "' is a palidrome!");
			}
			
		}
	}

}

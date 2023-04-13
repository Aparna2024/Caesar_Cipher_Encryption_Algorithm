package assignments;

//Question: write a program to implement Caesar Cipher encryption
//algorithm, based on below given conditions 
//Input: a) has to be a plain text
//       b) key[any integer between 0-25 of your choice indicating the shift]
//Output: Encrypted Message[Cipher-Text]
public class Homework1 {
	
	//method for Plain-text encryption
	public static String encryption(String plainText, int key) {
		
		//the if-else statement takes the integer of key variable 
		
			//if the key is greater than 25 then it will be place somewhere between 0 to 25
		
				//if it is less than 25 then it also be placed somewhere between 0 to 25
		
		if(key>25) {
			
			key = key%25;
		}
		else if (key<0) { //if key is negative 
			
			key = (key%25)+25;
			
		}
		//string for the cipher text 
		
		String cipherText = "";
		
		int length = plainText.length(); //gets the length of the plain text
		
		//for loops through the plain text 
		
		for(int i = 0; i<length; i++) {
			
			char ch = plainText.charAt(i); //we take character of index i
			
			if(Character.isLetter(ch)) { //checks if the character is the letter 
				
				if(Character.isLowerCase(ch)) { //checks if the character is lowercase
					
					char c = (char)(ch+key); //adds key to the integer value
					
					if(c>'z') { //if 'c' is greater than 'z' which is the ASCII value
						
						//new character added to the cipher text string 
							//if its outofbound
						
						cipherText += (char)(ch - (25-key));  
					}
					//if its not outofbound
					else {
						cipherText += c;
					}
				}
				else if(Character.isUpperCase(ch)) { //checks if the character is uppercase 
					
					char c = (char)(ch+key);
					
					if(c > 'Z') {
						
						cipherText += (char)(ch - (25-key));
					}
				
				else  { 
					cipherText += c;
				}
			}
		}
		else { 
			cipherText +=ch;
		}
	}
		//return statement of the cipher text
		
		return cipherText;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//this is where the message goes in the String text
		
		String text = "QUESTION";
		
		String cipher = encryption(text,4);
		
		//prints the encrypted text 
		
		System.out.println(cipher);

	}

}

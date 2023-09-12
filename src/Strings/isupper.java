package Strings;

public class isupper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char value='s';
		
		//Character.isUpperCase(s);
		boolean checkBool = Character.isUpperCase(value);
		boolean checkBool1 = Character.isLowerCase(value);
		boolean checkBool2 = Character.isDigit(value);
		// print result
		if(checkBool){
			System.out.print("User input \'"+value+"\' is Upper case");
		}
		else{
			System.out.print("User input \'"+value+"\' is not Upper case");
		}
	}

}

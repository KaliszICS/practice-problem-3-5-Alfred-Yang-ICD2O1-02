/**

        * File: Lesson 3.5 - Problem Solving and Good Programming Style

        * Author: Alfred Yang

        * Date Created: April 8, 2026

        * Date Last Modified: April 8, 2026

        */
public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(getFirstName("Mary Jane Watson"));
		System.out.println(getFirstName("  Alice Smith"));
		System.out.println(getLastName("John Doe"));
		System.out.println(isValidName("John"));
	}

	public static void q1() {
		//Write question 1 code here
	}
	public static String getFirstName(String buh){
		String firstName;
		buh = buh.trim();
		int space = buh.indexOf(" ");
		firstName = buh.substring(0, space); 
		return firstName;
		}

	public static String getLastName(String buh){
		String lastName;
		buh = buh.trim();
		int space = buh.lastIndexOf(" ");
		lastName = buh.substring(space+1); 
		return lastName;
		}

		public static Boolean isValidName(String buh){
			buh = buh.trim();
			int space = buh.indexOf(" ");
			if (!(buh.contains(" "))){
				return false;
			}
			String first = buh.substring(0, space);
			String last = buh.substring(space+1);

			if (first.contains(" ") || last.contains(" ")){
				return false;
			}
			else if (first.length() < 2 || last.length() < 2){
				return false;
			}
			else {
				return true;
			}
		}
	public static void q2() {
		//Write question 2 code here
	}

	public static void q3() {
		//Write question 3 code here
	}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}

}

package reverse;

import java.util.Scanner;

public class reverse_usingStringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original;
		System.out.println("enter the string to be reversed");
		Scanner in= new Scanner(System.in);
		original= in.nextLine();
		StringBuilder str= new StringBuilder();
		str.append(original);
		System.out.println("reversed string is: "+str.reverse());
	}

}

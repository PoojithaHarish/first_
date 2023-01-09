package reverse;

import java.util.Scanner;

public class reverse_wo_stringfunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original , reverse= "";
		System.out.println("Enter the string to be reversed");
		Scanner sc= new Scanner(System.in);
		original= sc.nextLine();
		int length = original.length();
		for (int i=length-1;i>=0;i--) {
			reverse+=original.charAt(i);
		}
		System.out.println("reversed string is: "+reverse);
	}

}

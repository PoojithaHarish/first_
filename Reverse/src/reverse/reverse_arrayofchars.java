package reverse;

import java.util.Arrays;

public class reverse_arrayofchars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[] = {'A', 'B', 'C', 'D'};
//	    char c_rev[] = new char[4];
//	    for (int i = 3; i >= 0; i--) {
//	        c_rev[i] = c[3 - i];
//	    }
//	    System.out.println(Arrays.toString(c_rev));

		String reversed = new StringBuilder(new String(c)).reverse().toString();
		//char d[]=reversed.toCharArray();
		System.out.println("reversed array of chars \n"+reversed);
		//System.out.println("reversed char array is "+d);   doesn't work

	}

}

package Pattern;

public class Palendrome {



	public static void main(String[] args) {

		String org="madam";
		String rev="";

		for (int i=org.length()-1;i>=0;i--) {

			rev=rev+org.charAt(i);

		}
		System.out.println(rev);

		if(rev.equals(org)) {
			System.out.println("Given string is palendrome");
		}
		else {
			System.out.println("Given dtring is not palendrome");
		}

	}
}

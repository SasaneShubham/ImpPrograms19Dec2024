package Pattern;

public class Sample11 {

//	*************
//	  *********
//	    *****
//	      *
	
	
	public static void main(String[] args) {
		
	int space=0;
	int star=13;
	
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=space;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=star;j++) {
			System.out.print("*");
		}
		System.out.println();
		space=space+2;
		star=star-4;
	}
  }
}

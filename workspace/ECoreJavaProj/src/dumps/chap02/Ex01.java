package dumps.chap02;

public class Ex01 {

		  public static void main (String[] args) {
//		    char a = '\c';  // 1---ERROR HERE 
//		    char b = '\l';  // 2
		    char c = '\"';  // 3
//		    char d = '\d';  // 4
		    char e = '\'';  // 5
		    Ex01.checkEscapeSeq();
		    
		    
		}
		  
		  public static void checkEscapeSeq() {
			  
			    System.out.println("Example Escape SEQUENCES----");
			    System.out.println("HINT--Blue Films Need Room Too ----");
			    System.out.println("Name\bRollNo\tAddress");
			    System.out.println("Name\nRollNo\nAddress");
			    System.out.println("Name\rRollNo\rAddress");
			    System.out.println("Name\'RollNo\'Address");
			    System.out.println("Name\"RollNo\"Address");
			    System.out.println("Name\\RollNo\\Address");

			}
  
}

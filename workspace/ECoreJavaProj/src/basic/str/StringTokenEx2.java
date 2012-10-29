/**
 * 
 */
package basic.str;

import java.util.StringTokenizer;

/**
 * @author anil.sahu
 * 
 * WAP to print your frndz names in seprate line.
 *
 */
public class StringTokenEx2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Method 1 
		mtd1();
		
		//Method 2
		mtd2();

	}

	public static void mtd1() {
		String frndzNames = "Sirisha,Pavitra,Madhu";
		String seperator =",";
		StringTokenizer	stObj = new StringTokenizer(frndzNames,seperator);
		String firstName=stObj.nextToken();
		System.out.println("First Name :"+firstName);
		String secName=stObj.nextToken();
		System.out.println("Sec Name :"+secName);
		String thirName=stObj.nextToken();
		System.out.println("Third Name :"+thirName);
	}
	public static void mtd2() {
		String frndzNames = "Sirisha,Pavitra,Madhu";
		String seperator =",";
		StringTokenizer	stObj = new StringTokenizer(frndzNames,seperator);
		while(stObj.hasMoreElements()){
			System.out.println(stObj.nextToken());
			
		}
	}

}

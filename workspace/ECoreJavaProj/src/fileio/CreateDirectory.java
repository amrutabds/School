package fileio;

/*
Create directory
This Java example shows how to create a directory in the filesystem using mkdir
method of Java File class.
*/

import java.io.*;

public class CreateDirectory {
	
	
	static public File fObj1;

public static void main(String[] args) {

 //create file object
 File dir = new File("C://FileIO//DemoDirectory");

  
 /*
  * To create directory in the filesystem use,
  * boolean mkdir() method of Java File class.
  *
  * This method returns true if the directory was created successfully, false
  * otherwise.
  */
 

  boolean isDirectoryCreated = dir.mkdir();

  if(isDirectoryCreated)
    System.out.println("Directory created successfully");
  else
    System.out.println("Directory was not created successfully");
  
  CreateDirectory.compareFiles(dir);
  
}

public static void compareFiles(File dir) {
	String path=dir.getAbsolutePath();
	  System.out.println("Path is :"+path);
	  String parent=dir.getParent();
	  System.out.println("Parent is :"+parent);
	  fObj1 = new File("C:\\FileIo\\Family.txt");
	  File fObj2 = new File("C:\\FileIo\\Lily.txt");
	  File fObj3 = new File("C:\\FileIo\\demo.txt");
	  File fObj4 = new File("C:\\Docs\\01.jpg");
	  
	  int same=fObj1.compareTo(fObj2);
	  System.out.println("compareTo fObj1 to fObj2 same :"+same);
	  int diff=fObj1.compareTo(fObj3);
	  System.out.println("compareTo fObj1 to fObj3 diff :"+diff);
	  int other=fObj1.compareTo(fObj4);
	  System.out.println("compareTo fObj1 to fObj4 other :"+other);
	  int other1=dir.compareTo(fObj1);
	  System.out.println("compareTo dir to fObj1 other11 :"+other1);
	   delADirectory(dir,fObj2);

       
   
}



public static void delADirectory(File dir, File fObj2) {
	boolean del=dir.delete();
	 if(del)
		    System.out.println("The path:"+dir.getAbsolutePath()+" deleted successfully");
		  else
		    System.out.println("The path:"+dir.getAbsolutePath()+" not deleted");
	 boolean det=fObj1.delete();
	 if(det)
		    System.out.println("The path:"+fObj1.getAbsolutePath()+" deleted successfully");
		  else
		    System.out.println("The path:"+fObj1.getAbsolutePath()+" not deleted ");

	  	  
	 boolean delet=fObj2.delete();
	 if(delet)
		    System.out.println("The path:"+fObj2.getAbsolutePath()+" deleted successfully");
		  else
		    System.out.println("The path:"+fObj2.getAbsolutePath()+" not deleted ");
		  	  

  }
}

/*
Output would be
Directory created successfully
*/
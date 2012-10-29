package learn.exc;
import java.io.*;
class FileEx{//u can not name it as File as it is already a predefined class.
	public static void main(String []args){
	
		try{
			File file1 = new File("//H://School//learn//exc");
			File file2 = new File("//H://School//learn//exc//FileEx.java");

			System.out.println("Name of  file is " + file1.getName());
			if((file1.isFile())||(file2.isFile())){
			    if(file1.isFile()){
			     System.out.println(file1.getAbsolutePath()+" Is a file");
			    }else if(file2.isFile()){
			          System.out.println(file2.getAbsolutePath()+" Is a file");
			        }else{
			            System.out.println("It is not a file");
					}
			}
			if(file1.isDirectory()){
			 System.out.println("The other Is a dir.Its path is  "+file1.getPath());
			 System.out.println("The other Is a dir.Its Absolutepath is  "+file1.getAbsolutePath());
			}else{
			 System.out.println("The other is not a dir.Its path is   "+file2.getPath());
			 System.out.println("The other Is a dir.Its Absolutepath is  "+file2.getAbsolutePath());
			}
	    }catch(Exception e){
	    System.out.println("Exception occured");
	    }
	}
}
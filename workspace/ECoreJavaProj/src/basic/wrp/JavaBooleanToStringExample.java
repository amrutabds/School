package basic.wrp;

/*
Convert java Boolean object to String object Example
This example shows how to convert java Boolean object into String object.
*/

public class JavaBooleanToStringExample {

public static void main(String[] args) {
  //construct Boolean object
  Boolean bObj = new Boolean("true");
 
  //use toString method of Boolean class to convert it into String
  String str = bObj.toString();
  System.out.println(str);
}
}

/*
Output would be
true
*/
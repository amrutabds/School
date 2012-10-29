public class Q8{
 private String country, name;
    public getCountry() { 
    return country; 
	}
}

 class Yen extends Q8 {
 public String getCountry() { return super.country; }
 }

 class Euro extends Q8 {
 public String getCountry(String timeZone) {
 return super.getCountry();
 }
 }

 /*Which two are correct? (Choose two.)
A. Yen returns correct values.
B. Euro returns correct values.
C. An exception is thrown at runtime.
D. Yen and Euro both return correct values.
E. Compilation fails because of an error at line 25.
F. Compilation fails because of an error at line 30.


Ans= B,E
E is ans.Its because  The country is  PRIVATE variable which cannot be accesed by calling "return super.country"*/
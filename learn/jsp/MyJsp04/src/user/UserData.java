
/*To collect this data, (from getName2.html)we define a Java class with fields "username", "email" and "age" and we provide setter methods "setUsername",
 "setEmail" and "setAge", as shown.  A "setter" method is just a method that starts with "set" followed by the name of the field. 
 The first character of the field name is upper-cased.  So if the field is "email", its "setter" method will be "setEmail".  Getter methods 
 are defined similarly, with "get" instead of "set".   Note that the setters  (and getters) must be public.
*/

package user;

public class UserData {
    String fname;
    String eml;
    String pwd;
    
    public void setFname( String value )
    {
        fname = value;
    } 
	public void setEml( String value )
    {
        eml = value;
    }

    public void setPwd( String value )
    {
        pwd = value;
    }

    public String getFname() { return fname; }
	
    public String getEml() { return eml; }

   public String getPwd() { return pwd; }
}
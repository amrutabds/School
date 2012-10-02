
/*To collect this data, (from getName2.html)we define a Java class with fields "username", "email" and "age" and we provide setter methods "setUsername",
 "setEmail" and "setAge", as shown.  A "setter" method is just a method that starts with "set" followed by the name of the field. 
 The first character of the field name is upper-cased.  So if the field is "email", its "setter" method will be "setEmail".  Getter methods 
 are defined similarly, with "get" instead of "set".   Note that the setters  (and getters) must be public.
*/

package user;

public class UserData {
    String username;
    String userhname;
	String email;
    int age;
    
    public void setUsername( String value )
    {
        username = value;
    } 
	public void setUserhname( String value )
    {
        username = value;
    }

    public void setEmail( String value )
    {
        email = value;
    }

    public void setAge( int value )
    {
        age = value;
    }

    public String getUsername() { return username; }
	public String getUserhname() { return userhname; }

    public String getEmail() { return email; }

    public int getAge() { return age; }
}
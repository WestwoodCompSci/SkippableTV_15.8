import java.io.Serializable;
import java.net.URL;



public class User implements Serializable
{
	private String myUsername;
	private URL myPic;
	
	
	public User(String username, String mypassword, URL mypic)
	{
		setMyUsername(username);
		setMyPic(mypic);
	}
	
	public String getMyUsername() 
	{
		return myUsername;
	}
	
	public void setMyUsername(String myUsername) 
	{
		this.myUsername = myUsername;
	}
	
	public URL getMyPic() 
	{
		return myPic;
	}
	
	public void setMyPic(URL myPic) 
	{
		this.myPic = myPic;
	}
	

}

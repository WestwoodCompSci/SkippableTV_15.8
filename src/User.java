import java.awt.image.BufferedImage;



public class User 
{
	private String myUsername;
	private String myPassword;
	private BufferedImage myPic;
	
	
	public User(String username, String mypassword, BufferedImage mypic)
	{
		setMyUsername(username);
		setMyPassword(mypassword);
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

	
	public String getMyPassword() {
		return myPassword;
	}

	public void setMyPassword(String myPassword) 
	{
		this.myPassword = myPassword;
	}

	
	public BufferedImage getMyPic() 
	{
		return myPic;
	}
	
	public void setMyPic(BufferedImage myPic) 
	{
		this.myPic = myPic;
	}
	

}

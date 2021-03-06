package Backend;


import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;


public class User extends JSONize implements Serializable
{
	private String myUsername;
	private URL myPic;
	private ArrayList<Show> myShows;
	
	
	public User(String username, URL mypic)
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
	
	public ArrayList<Show> getShows(){
		return myShows;
	}
	
	public void addShow(Show s){
		myShows.add(s);
	}
	
	public void removeShow(Show s){
		if(myShows.contains(s)){
			myShows.remove(s);
		}
	}

	@Override
	public String toJSON() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void fromJSON(String s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected String getJSONName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

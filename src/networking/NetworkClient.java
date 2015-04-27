package networking;

import java.net.*;

public final class NetworkClient {

	public static final String delim="||";//TODO: for now...
	
	public static final String target="";//TODO: where is the server?
	
	//TODO: identify which client?
	
//------------------------------------USER
	
	/**This is a method that the GUI will use to verify if the username and PSWD are right
	 * @param 
	 * @throws IllegalArgumentException 
	 * */
	public static String validateUser(String uName){
		return null;
	}
	
	/**This is a method that the GUI will use to update a user's PSWD. Passwords will be encrypted
	 * @param 
	 * @throws IllegalArgumentException 
	 * */
	public static String updateUser(String uName,String oldPswd,String newPswd){
		return null;
	}
	
	/**This is a method that the GUI will use to request the user's profile images. 
	 * 
	 * Tokens are a preliminary way to verify user authenticity(may not be needed)
	 * @param 
	 * @throws IllegalArgumentException 
	 * */
	public static String requestUserPic(String uName,String token){
		return null;
	}
//---------------------------------------------------Show
	
	/**This is a method that the GUI will use to get a show
	 * @param 
	 * @throws IllegalArgumentException 
	 * */
	public static String requestShow(String showID){
		return null;
	}
	
}

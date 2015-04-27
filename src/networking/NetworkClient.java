package networking;

import java.net.*;

public final class NetworkClient {

	public static final String delim="||";//TODO: for now...
	
	public static final String target="";//TODO: where is the server?
	
	//TODO: identify which client?
	
//------------------------------------USER
	
	/**This is a method that the GUI will use to verify if the username and PSWD are right
	 * @param uName - Username
	 * @throws IllegalArgumentException 
	 * */
	public static String validateUser(String uName){
		return null;
	}
	
	/**This is a method that the GUI will use to update a user's PSWD. Passwords will be encrypted
	 * @param uName - Username 
	 * @param oldPswd - The old Password of the User
	 * @param newPswd - The new Password of the User
	 * @throws IllegalArgumentException 
	 * */
	public static String updateUser(String uName,String oldPswd,String newPswd){
		return null;
	}
	
	/**This is a method that the GUI will use to request the user's profile images. 
	 * 
	 * Tokens are a preliminary way to verify user authenticity(may not be needed)
	 * @param uName - Username
	 * @param token - token of image
	 * @throws IllegalArgumentException 
	 * */
	public static String requestUserPic(String uName,String token){
		return null;
	}
//---------------------------------------------------Show
	
	/**This is a method that the GUI will use to get a show
	 * @param showID - Whatever we decide to use as ID
	 * @throws IllegalArgumentException 
	 * */
	public static String requestShow(String showID){
		return null;
	}
	
}

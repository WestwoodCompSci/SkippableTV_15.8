package networking;

import java.net.*;

public final class NetworkClient {

	public static final String delim="||";//TODO: for now...
	
	public static final String target="";//TODO: where is the server?
	
	//TODO: identify which client?
	
	/**This method generates the request String to be sent.
	 * It is used by all the other methods below
	 * @param requestCode - the codes the class uses. Should make static final variables. TODO:
	 * @param args - any other arguments needed to specify the requests
	 * */
	private static String genReq(String requestCode, Object ... args){
		String s=requestCode;
		for(Object x:args){
			s+=delim+x.toString();
		}
		return s;
	}
	
	/*For each of the Below methods, these methods will return a string 
	 * that should be sent to the backend for processing the request
	 * */
//------------------------------------USER
	
	/**This is a method that the GUI will use to get a user's public info
	 * @param uName - Username
	 * @throws IllegalArgumentException 
	 * */
	public static String getUser(String uName){
		return genReq("GETUSER",uName);
	}
	
	/**This is a method that the GUI will use to verify if the username and PSWD are right
	 * @param uName - Username
	 * @throws IllegalArgumentException 
	 * */
	public static String validateUser(String uName){
		return genReq("VALIDATEU",uName);
	}
	
	/**This is a method that the GUI will use to update a user's PSWD. Passwords will be encrypted
	 * @param uName - Username 
	 * @param oldPswd - The old Password of the User
	 * @param newPswd - The new Password of the User
	 * @throws IllegalArgumentException 
	 * */
	public static String updateUser(String uName,String oldPswd,String newPswd){
		return genReq("UPDATEU",uName,oldPswd,newPswd);//TODO: encrypt before sending!!!
	}
	
	/**This is a method that the GUI will use to request the user's profile images. 
	 * 
	 * Tokens are a preliminary way to verify user authenticity(may not be needed)
	 * @param uName - Username
	 * @param token - Maybe used to verify login?
	 * @throws IllegalArgumentException 
	 * */
	public static String requestUserPic(String uName,String token){
		return genReq("REQUESTUPIC",uName,token);
	}
//---------------------------------------------------Show
	
	/**This is a method that the GUI will use to get a show
	 * @param showID - Whatever we decide to use as ID
	 * @throws IllegalArgumentException 
	 * */
	public static String requestShow(String showID){
		return genReq("REQUESTSHOW",showID);
	}

	/**This is a method that the GUI will use to get a show's season
	 * @param showID - Whatever we decide to use as ID
	 * @param season - Season number
	 * @throws IllegalArgumentException 
	 * */
	public static String requestSeason(String showID,int season){
		return genReq("REQUESTSHOW.SEASON",showID,season);
	}
	
	/**This is a method that the GUI will use to get an episode for a show
	 * @param showID - Whatever we decide to use as ID
	 * @param season - Season number
	 * @param episode- Episode number
	 * @throws IllegalArgumentException 
	 * */
	public static String requestEpisode(String showID,int season, int episode){
		return genReq("REQUESTSHOW.SEASON.EP",showID,season,episode);
	}
	
	/**This is a method that the GUI will use to edit a show
	 * @param showID - Whatever we decide to use as ID
	 * @throws IllegalArgumentException 
	 * */
	public static String editShow(String showID){
		return genReq("EDITSHOW",showID);
	}
	
	/**This is a method that the GUI will use to edit a show's season
	 * @param showID - Whatever we decide to use as ID
	 * @param season - Season number
	 * @throws IllegalArgumentException 
	 * */
	public static String editSeason(String showID,int season){
		return genReq("EDITSHOW",showID,season);
	}
	
	/**This is a method that the GUI will use to edit an episode
	 * @param showID - Whatever we decide to use as ID
	 * @param season - Season number
	 * @param episode- Episode number
	 * @throws IllegalArgumentException 
	 * */
	public static String editEp(String showID,int season,int ep){
		return genReq("EDITSHOW",showID,season,ep);
	}
	
	/*/
	public static void main(String[]args){
		System.out.println(genReq("TEST","Part1",1));
	}
	//*/
	
}

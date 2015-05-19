package networking;

import java.net.*;

/**This is a class that will work with the GUI by generating the Strings required to request or send data.
 * The command methods generate a string in the following format:
 * 
 * TODO:Edit format to send objects
 * 
 * COMMANDTYPE+delim+extraRequiredSpecifiers+delim+specifier2...delim++lastSpecifier
 * 
 * The command will be interpreted by th3 NetworkBackend class
 * @author Michael Darmawan
 */
public final class NetworkClient implements NetworkConstants{

	
	
	//TODO: identify which client?
	
	/**This method generates the request String to be sent.
	 * It is used by all the other methods below
	 * @param requestCode - the codes the class uses.
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
	 * @throws IllegalArgumentException - Invalid input
	 * @return String to be sent to backEnd
	 * */
	public static String getUser(String uName){
		return genReq(getU,uName);
	}
	
	/**This is a method that the GUI will use to verify if the username and PSWD are right
	 * @param uName - Username
	 * @throws IllegalArgumentException - Invalid input
	 * @return String to be sent to backEnd
	 * */
	public static String validateUser(String uName){
		return genReq(valU,uName);
	}
	
	/**This is a method that the GUI will use to update a user's PSWD. Passwords will be encrypted
	 * @param uName - Username 
	 * @param oldPswd - The old Password of the User
	 * @param newPswd - The new Password of the User
	 * @throws IllegalArgumentException - Invalid input
	 * @return String to be sent to backEnd
	 * */
	public static String updateUser(String uName,String oldPswd,String newPswd){
		return genReq(updU,uName,oldPswd,newPswd);//TODO: encrypt before sending!!!
	}
	
	/**This is a method that the GUI will use to request the user's profile images. 
	 * 
	 * Tokens are a preliminary way to verify user authenticity(may not be needed)
	 * @param uName - Username
	 * @param token - Maybe used to verify login?
	 * @throws IllegalArgumentException - Invalid input
	 * @return String to be sent to backEnd 
	 * */
	public static String requestUserPic(String uName,String token){
		return genReq(reqUP,uName,token);
	}
//---------------------------------------------------Show
	
	/**This is a method that the GUI will use to get a show
	 * @param showID - Whatever we decide to use as ID
	 * @throws IllegalArgumentException - Invalid input
	 * @return String to be sent to backEnd 
	 * */
	public static String requestShow(String showID){
		return genReq(reqSh,showID);
	}

	/**This is a method that the GUI will use to get a show's season
	 * @param showID - Whatever we decide to use as ID
	 * @param season - Season number
	 * @throws IllegalArgumentException - Invalid input
	 * @return String to be sent to backEnd 
	 * */
	public static String requestSeason(String showID,int season){
		return genReq(reqSe,showID,season);
	}
	
	/**This is a method that the GUI will use to get an episode for a show
	 * @param showID - Whatever we decide to use as ID
	 * @param season - Season number
	 * @param episode- Episode number
	 * @throws IllegalArgumentException - Invalid input
	 * @return String to be sent to backEnd  
	 * */
	public static String requestEpisode(String showID,int season, int episode){
		return genReq(reqEp,showID,season,episode);
	}
	
	/**This is a method that the GUI will use to edit a show
	 * @param showID - Whatever we decide to use as ID
	 * @param showDat - The String form of the Show
	 * @throws IllegalArgumentException - Invalid input
	 * @return String to be sent to backEnd 
	 * */
	public static String editShow(String showID,String showDat){
		return genReq(edSh,showID,showDat);
	}
	
	/**This is a method that the GUI will use to edit a show's season
	 * @param showID - Whatever we decide to use as ID
	 * @param season - Season number
	 * @param sDat - The String form of the Season data
	 * @throws IllegalArgumentException - Invalid input
	 * @return String to be sent to backEnd  
	 * */
	public static String editSeason(String showID,int season,String sDat){
		return genReq(edSe,showID,season,sDat);
	}
	
	/**This is a method that the GUI will use to edit an episode
	 * @param showID - Whatever we decide to use as ID
	 * @param season - Season number
	 * @param ep - Episode number
	 * @param epDat - The String form of the episode
	 * @throws IllegalArgumentException - Invalid input
	 * @return String to be sent to backEnd 
	 * */
	public static String editEp(String showID,int season,int ep,String epDat){
		return genReq(edEp,showID,season,ep,epDat);
	}
	
	/*/
	public static void main(String[]args){
		System.out.println(genReq("TEST","Part1",1));
	}
	//*/
	
}

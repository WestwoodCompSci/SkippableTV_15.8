package networking;

/**This is an interface that has the constants used for NetworkClient and NEtworkBackend
 * @author Michael Darmawan 
 * */
public interface NetworkConstants {
	/**This is a field that is used as a delimiter to separate the parts of our request
	 */
	public static final String delim="||";//TODO: for now...
	
	/**This is a field that has may be needed to target the server...
	 * INCOMPLETE
	 */
	public static final String target="";//TODO: where is the server?
	
	/**The String that is used to start a getUser command
	 */
	public static final String getU="GETUSER";
	/**The String that is used to start a get validate user command(for logins)
	 */	
	public static final String valU="VALIDATEU";
	/**The String that is used to start a update user command (for password change)
	 */
	public static final String updU="UPDATEU";
	/**The String that is used to start a get user pic command
	 */
	public static final String reqUP="REQUESTUPIC";
	/**The String that is used to start a get a show
	 */
	public static final String reqSh="REQUESTSHOW";
	/**The String that is used to start a get a season
	 */
	public static final String reqSe="REQUESTSEASON";
	/**The String that is used to start a get an episode
	 */
	public static final String reqEp="REQUESTEPISODE";
	/**The String that is used to start an edit show command
	 */
	public static final String edSh="EDITSHOW";
	/**The String that is used to start an edit season command
	 */
	public static final String edSe="EDITSEASON";
	/**The String that is used to start an edit episode command
	 */
	public static final String edEp="EDITEPISODE";
	
	

}

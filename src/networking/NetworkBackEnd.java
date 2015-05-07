package networking;

/**This is a class that is going to be used with the Network Backend.
 * @author Michael Darmawan
 *
 */
public class NetworkBackEnd {
	//BackEnd b;
	
	//TODO:Parse request String and return appropriate object.
	public static void interpret(String cmd){
		String[] prt=cmd.split(NetworkClient.delim);
		if(prt[0].equals("")){
			
		}
	}	
}

package networking;

/**This is a class that is going to be used with the Network Backend.
 * @author Michael Darmawan
 *
 */
public class NetworkBackEnd {
	//BackEnd b;
	
	//TODO:Parse request String and return appropriate object.
	/**This is a method to interpret Protocols sent 
	 * 
	 * */
	public static void interpret(String cmd){
		String[] prt=cmd.split(NetworkClient.delim);
		if(prt[0].equals(NetworkClient.edEp)){
			
		}else if(prt[0].equals(NetworkClient.edSe)){
			
		}else if(prt[0].equals(NetworkClient.edSh)){
			
		}else if(prt[0].equals(NetworkClient.getU)){
			
		}else if(prt[0].equals(NetworkClient.reqUP)){
			
		}else if(prt[0].equals(NetworkClient.updU)){
			
		}else if(prt[0].equals(NetworkClient.valU)){
			
		}else if(prt[0].equals(NetworkClient.reqSh)){
			
		}else if(prt[0].equals(NetworkClient.reqSe)){
			
		}else if(prt[0].equals(NetworkClient.reqEp)){
			
		}
	}	
}

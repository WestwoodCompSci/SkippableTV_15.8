package networking;

/**This is a class that is going to be used with the Network Backend.
 * @author Michael Darmawan
 *
 */
public class NetworkBackEnd implements NetworkConstants{
	//BackEnd b;
	
	//TODO:Parse request String and return appropriate object.
	/**This is a method to interpret Protocols sent 
	 * 
	 * */
	public static void interpret(String cmd){
		String[] prt=cmd.split(delim);
		if(prt[0].equals(edEp)){
			
		}else if(prt[0].equals(edSe)){
			
		}else if(prt[0].equals(edSh)){
			
		}else if(prt[0].equals(getU)){
			
		}else if(prt[0].equals(reqUP)){
			
		}else if(prt[0].equals(updU)){
			
		}else if(prt[0].equals(valU)){
			
		}else if(prt[0].equals(reqSh)){
			
		}else if(prt[0].equals(reqSe)){
			
		}else if(prt[0].equals(reqEp)){
			
		}
	}	
}

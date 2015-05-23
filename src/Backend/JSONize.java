package Backend;

import java.util.*;
/**A class to facilitate JSON formatting (modified JSON)
 * @author michaeld
 */
public abstract class JSONize {

	/**Turns the object into a modified JSON format
	 * @return modified JSON Format
	 */
	public abstract String toJSON(); 
	/**Reads input JSON and is overwritten by the JSON input
	 * @param s - The JSON to write into the object
	 */
	public abstract void fromJSON(String s);
	protected String[] parseObjFields(String toParse){
		if(toParse.startsWith("{")&toParse.endsWith("}")){
			return toParse.trim().substring(1,toParse.length()-1).split("[^\\\\];");
		}else throw new IllegalArgumentException("Not an Object");
	}
	protected String[] parseField(String field){
		return field.split("[^\\\\]:");
	}
	protected String[] parseArray(String arr){
		if(arr.startsWith("[")&&arr.endsWith("]")){
			return arr.trim().substring(1, arr.length()-1).split("[^\\\\],");
		}else throw new IllegalArgumentException("Not an Array");
	}

	protected String genArrayStr(List<JSONize> c){
		String out="[";
		for(JSONize j:c){
			out+=sanitize(j.getJSONName())+",";
		}
		return out.substring(0,out.length()-1)+"]";
	}
	protected String genArrayStr(Collection<String> c,boolean b){
		String out="[";
		for(String s:c){
			out+=sanitize(s)+",";
		}
		return out.substring(0,out.length()-1)+"]";
	}

	protected abstract String getJSONName();

	protected static String genObjField(String fieldName,String value){
		return (sanitize(fieldName)+":"+sanitize(value));
	}

	public static String sanitize(String s){
		s.replace(";", "\\;");
		s.replace(":", "\\:");
		s.replace(",", "\\,");
//		s.replace("{", "\\{");
//		s.replace("}", "\\}");
		s.replace("]", "\\]");
		s.replace("[", "\\[");

		return s;
	}
	public static String deSanitize(String s){
		s.replace("\\;",";");
		s.replace("\\:",":");
		s.replace("\\,",",");
//		s.replace("\\{","{");
//		s.replace("\\}","}");
		s.replace("\\]","]");
		s.replace("\\[","[");
		return s;
	}
	public static String[] deSanitizeArr(String[] sa){
		for(String s:sa){
			deSanitize(s);//do I have to reWrite it?
		}
		return sa;
	}



}

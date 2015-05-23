package Backend;
import java.io.Serializable;
import java.util.ArrayList;


public class Show extends JSONize implements Serializable
{
	private final String myName;
	private ArrayList<Season> mySeasons;
	
	public Show(String name){myName = name;}
	
	public String getName(){return myName;}
	
	public ArrayList<Season> getSeasons(){return mySeasons;}
	
	public ArrayList<Season> addSeason(Season seas){
		mySeasons.add(seas);
		return mySeasons;
	}

	@Override
	public String toJSON() {
		String out="{";
		out+=genObjField("Class","Episode")+";";
		out+=genObjField("myTitle",this.getName())+";";
		
		out+=genObjField("mySeasons",genArrayStr(mySeasons))+";";
		//Counter is user personal

		return out+"}";
	}

	@Override
	public void fromJSON(String s) {
		
		
	}

	@Override
	protected String getJSONName() {
		return getName();
	}
	
}

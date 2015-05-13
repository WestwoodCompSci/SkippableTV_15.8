import java.io.Serializable;
import java.util.ArrayList;


public class Show implements Serializable
{
	private final String myName;
	private ArrayList<Season> mySeasons;
	
	public Show(String name)
	{
		myName = name;
	}
	
	public String getName()
	{
		return myName;
	}
	
	public ArrayList<Season> getSeasons()
	{
		return mySeasons; 
	}
	
	public ArrayList<Season> addSeason(Season seas)
	{
		mySeasons.add(seas);
		return mySeasons;
	}
}

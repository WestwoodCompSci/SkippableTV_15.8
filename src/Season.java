import java.awt.image.BufferedImage;
import java.util.ArrayList;


public class Season {
	private ArrayList<Episode> mySeason;
	private final BufferedImage myPic;
	private String mySummary;
	
	public Season(ArrayList<Episode> myseason, BufferedImage mypic, String mysummary )
	{
		mySeason = myseason;
		myPic = mypic;
		mySummary = mysummary;
		
	}

	public ArrayList<Episode> getMySeason() 
	{
		return mySeason;
	}

	public void addEpisode(Episode e) 
	{
		mySeason.add(e);
	}
	
	public int getNumberEpisodes()
	{
		return mySeason.size();
	}
	
	public BufferedImage getMyPic()
	{
		return myPic;
	}
	
	public String getMySummary()
	{
		return mySummary;
	}
	
	public void resetMySummary(String newSummary)
	{
		mySummary = newSummary;
	}
	
	public void addtoSummary(String summaryaddition)
	{
		mySummary = mySummary + " " + summaryaddition;
	}
	
	
	
	

}

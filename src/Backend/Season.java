package Backend;


import java.awt.image.BufferedImage;
import java.util.ArrayList;


public class Season {
	private ArrayList<Episode> mySeason;
	private final BufferedImage myPic;
	private String mySummary;
	private int myProgress;
	private int myCounter;
	
	public Season(ArrayList<Episode> myseason, BufferedImage mypic, String mysummary )
	{
		mySeason = myseason;
		myPic = mypic;
		mySummary = mysummary;
		myProgress = 0;
		myCounter = 0;
		
		
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
	public int returnProgress(){
		return myProgress;
	}
	
	public Episode nextEpisode(){
		if(myCounter + 1 == mySeason.size()){
			myProgress++;
			return mySeason.get(++myCounter);
		}
		return null;
	}
	public Episode backEpisode(){
		if(myCounter-1 >= 0){
			myProgress--;
			return mySeason.get(--myCounter);
		}	
		return null;
	}
	

}

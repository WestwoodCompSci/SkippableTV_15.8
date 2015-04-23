import java.awt.image.BufferedImage;
import java.util.ArrayList;


public class Episode
{
	private final BufferedImage myPic;
	private final String myTitle;
	private String mySummary;
	private final String myLength;
	private double myRating;
	private ArrayList<String> myComments;
	private final ArrayList<String> myLinks;
	private double myCounter;
	
	public Episode(BufferedImage p, String t, String s, String l, ArrayList<String> links)
	{
		myPic = p;
		myTitle = t;
		mySummary = s;
		myLength = l;
		myLinks = links;
		
		myRating = 0.0;
		myCounter = 0.0;
	}

	public BufferedImage getMyPic()
	{
		return myPic;
	}

	public String getMyTitle()
	{
		return myTitle;
	}

	public String getMySummary()
	{
		return mySummary;
	}
	
	public void resetSummary()
	{
		mySummary = "";
	}
	
	public String addSummary(String s)
	{
		mySummary += s;
		return mySummary;
	}

	public String getMyLength()
	{
		return myLength;
	}

	public double getMyRating()
	{
		return myRating;
	}

	public double changeRating(int i)
	{
		double temp = myRating * myCounter;
		temp += i;
		myCounter += 1.0;
		myRating = temp/myCounter;
		return myRating;
	}

	public ArrayList<String> getMyComments()
	{
		return myComments;
	}

	public ArrayList<String> addComment(String s)
	{
		myComments.add(s);
		return myComments;
	}
	
	public ArrayList<String> getMyLinks()
	{
		return myLinks;
	}
	
}

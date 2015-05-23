package Backend;
import java.awt.image.BufferedImage;
import java.io.Serializable;
import java.util.*;


public class Episode extends JSONize implements Serializable
{
	private final BufferedImage myPic;
	private final String myTitle;
	private String mySummary;
	private final String myLength;
	private double myRating;
	private ArrayList<String> myComments;
	private final ArrayList<String> myLinks;
	private double myCounter;

	public Episode(BufferedImage p, String t, String s, String l, ArrayList<String> links){
		myPic = p;
		myTitle = t;
		mySummary = s;
		myLength = l;
		myLinks = links;

		myRating = 0.0;
		myCounter = 0.0;
	}

	public BufferedImage getMyPic(){return myPic;}

	public String getMyTitle(){return myTitle;}

	public String getMySummary(){return mySummary;}

	public void resetSummary(){mySummary = "";}

	public String addSummary(String s){
		mySummary += s;
		return mySummary;
	}

	public String getMyLength(){return myLength;}

	public double getMyRating(){return myRating;}

	public double changeRating(int i){
		double temp = myRating * myCounter;
		temp += i;
		myCounter += 1.0;
		myRating = temp/myCounter;
		return myRating;
	}

	public ArrayList<String> getMyComments(){return myComments;}

	public ArrayList<String> addComment(String s){
		myComments.add(s);
		return myComments;
	}

	public ArrayList<String> getMyLinks(){return myLinks;}

	//public String toString(){return null;//TODO:JSON the object}	


	public int getCounter(){return (int)myCounter;}

	@Override
	public String toJSON() {
		String out="{";
		out+=genObjField("Class","Episode")+";";
		out+=genObjField("myTitle",this.getMyTitle())+";";
		out+=genObjField("myLength",this.getMyLength())+";";
		out+=genObjField("mySummary",this.getMySummary())+";";
		//pic?
		out+=genObjField("myRating",String.format("%.2f", this.getMyRating()))+";";
		out+=genObjField("myComments",genArrayStr(myComments,true))+";";
		out+=genObjField("myLinks",genArrayStr(myLinks,true));
		//Counter is user personal

		return out+"}";
	}

	@Override
	public void fromJSON(String s) {
		String[]fields=this.parseObjFields(s);
		for(String f:fields){
			String[] field=this.parseField(f);
			deSanitizeArr(field);
			if(field[0].equals("myTitle")){
				//myTitle=field[1];//TODO:
			}else if(field[0].equals("myLength")){
				//myLength=field[1];
			}else if(field[0].equals("mySummary")){
				mySummary=field[1];
			}else if(field[0].equals("myRating")){
				myRating=Double.parseDouble(field[1]);
			}else if(field[0].equals("myComments")){
				String[] comments=this.parseArray(field[1]);
				myComments=new ArrayList<String>();
				for(String c:comments){
					myComments.add(c);
				}
			}else if(field[0].equals("myLinks")){
				//				String[] links=this.parseArray(field[1]);
				//				myLinks=new ArrayList<String>();
				//				for(String l:links){
				//					myLinks.add(l);
				//				}
			}

		}
	}

	@Override
	protected String getJSONName() {
		return getMyTitle();
	}

}

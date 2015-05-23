package Backend;


import java.awt.image.BufferedImage;
import java.io.Serializable;
import java.util.*;


public class Season extends JSONize implements Serializable{
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

	public ArrayList<Episode> getMySeason(){return mySeason;}

	public void addEpisode(Episode e){mySeason.add(e);}
	
	public int getNumberEpisodes(){return mySeason.size();}
	
	public BufferedImage getMyPic(){return myPic;}
	
	public String getMySummary(){return mySummary;}
	
	public void resetMySummary(String newSummary){mySummary = newSummary;}
	
	public void addtoSummary(String summaryaddition){mySummary = mySummary + " " + summaryaddition;}
	
	public int returnProgress(){return myProgress;}
	
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
	
	public int getMyCounter(){return myCounter;}
	
	@Override
	public String toJSON() {
		String out="{";
		out+=genObjField("Class","Season")+";";
		//out+=genObjField("myTitle",this.getMyTitle())+";";
		//out+=genObjField("myLength",this.getMyLength())+";";
		out+=genObjField("mySummary",this.getMySummary())+";";
		//pic?
		out+=genObjField("myCounter",String.format("%d", this.getMyCounter()))+";";
		out+=genObjField("mySeason",genArrayStr(mySeason))+";";
		//Progress
		return out+"}";
	}

	@Override
	public void fromJSON(String s) {
		String[]fields=this.parseObjFields(s);
		for(String f:fields){
			String[] field=this.parseField(f);
			deSanitizeArr(field);
			if(field[0].equals("mySummary")){
				mySummary=field[1];
			}else if(field[0].equals("myCounter")){
				myCounter=field[1];
			}else if(field[0].equals("mySeason")){
				String[] eps=this.parseArray(field[1]);
				ArrayList<String>myEps=new ArrayList<String>();
				for(String e:eps){
					myEps.add(e);
				}
				//mySeason=new ArrayList<Episode>();TODO:
				//mySeason.add(ep)
			}

		}
	}

	@Override
	protected String getJSONName() {
		return "";
	}

}

package DATABASEISIMPORTANT;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import Backend.*;

public class Database 
{

	static final String userFolder = "users";
	static final String showFolder = "shows";
	static String userDirectory = "";
	static final String delimiter = "|||";

	public User getUser(String username, String password)
	{

		userDirectory = (Database.userFolder + File.pathSeparator + username);

		if (new File(userDirectory).exists())
		{

			if (readFile(new File(userDirectory + File.pathSeparator + "pswd.txt")).get(0).equals(password))
			{

				try 
				{

					URL picLoc = new URL("http://www.skippable.tv/" + userDirectory + File.pathSeparator + "pic.jpg");

					return new User(username, picLoc);

				}

				catch (Exception e) 
				{ 

					System.out.println("there is a disturbance in the force"); 

					return null;

				}


			}

		}

		return null;

	}



	/**
	 * 
	 * Not 100% sure this actually creates folders... :)
	 * @param newUser
	 * @param password
	 * @return
	 */

	public boolean createUser(User newUser, String password, BufferedImage imago, String imageType)
	{
		
		try 
		{
			
			String userDirectory = (Database.userFolder + File.pathSeparator + newUser.getMyUsername());
			
			(new File(userDirectory)).mkdir();
			
			BufferedWriter b = new BufferedWriter(new FileWriter(userDirectory + File.pathSeparator + "pswd.txt"));
			
			b.write(password);
			b.close();
			
			ImageIO.write(imago, imageType, new File(userDirectory + File.pathSeparator + "profile" + imageType));
			
			return true;
			
		} 
		
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;

	}
	
	public boolean createUser(User newUser, String password)
	{
		
		try 
		{
		
			return createUser(newUser, password, ImageIO.read(new File("brian.jpg")), ".jpg");
		
		}
		
		catch (Exception e) { return false; }

	}

	public boolean updateUser(User updated, String password, BufferedImage profile, String imageType)
	{
		
		deleteUser(updated.getMyUsername(), password);
		
		try 
		{
		
			createUser(updated, password, profile, imageType);
		
		}
		
		catch (Exception e) { }
		
		return false;

	}
	
	public boolean updateUser(User updated, String password)
	{
		
		try
		{
			
			return updateUser(updated, password, ImageIO.read(new File("brian.jpg")), ".jpg");
			
		}
		
		catch (Exception e) { return false; }

	}

	public boolean deleteUser(String username, String password)
	{
		if(password.equals(readFile(new File(userDirectory + File.separator + "pswd.txt"))))
		{
			(new File(userDirectory)).delete();
			return true;
		}

		return false;

	}

	public ArrayList<Show> getSeries()
	{

		ArrayList<Show> series = new ArrayList<Show>();
		boolean stillShows = true;
		int counter = 0;
		while(stillShows)
		{
			String show = "" + counter;
			while(show.length() < 4)
				show = "0" + show;
			if(new File(Database.showFolder + File.pathSeparator + show).exists())
			{
				ArrayList<String> data = readFile(new File(Database.showFolder + File.pathSeparator + show + File.pathSeparator + "info.txt"));
				series.add(new Show(data.get(0)));
			}
			else
				stillShows = false;
		}
		return series;

	}

	public ArrayList<String> readFile(File target)
	{

		String line;

		ArrayList<String> lines = new ArrayList<String>();

		try 
		{

			BufferedReader reader = new BufferedReader(new FileReader(target));

			while ((line = reader.readLine()) != null)

				lines.add(line);

			reader.close();

		}

		catch (Exception e) 
		{ 

			System.out.println("Error"); 

			return null;

		}

		return lines;

	}

}

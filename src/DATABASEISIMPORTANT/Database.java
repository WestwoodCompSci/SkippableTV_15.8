package DATABASEISIMPORTANT;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

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
	
	public boolean createUser(User newUser, String password)
	{
		try {
			(new File(Database.userFolder + File.pathSeparator + newUser.getMyUsername())).mkdir();
			userDirectory = (Database.userFolder + File.pathSeparator + newUser.getMyUsername());
			BufferedWriter b = new BufferedWriter(new FileWriter(userDirectory + File.pathSeparator + "pswd.txt"));
			b.write(password);
			b.close();
			BufferedWriter d = new BufferedWriter(new FileWriter(userDirectory + File.pathSeparator + ".txt"));
			d.write(newUser.getMyUsername() + "|||" + newUser.getMyPic());
			d.close();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	public boolean updateUser(User updated, String password)
	{
		
		return false;
		
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
	
	public ArrayList<Season> getSeries()
	{
		
		return new ArrayList<Season>();
		
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

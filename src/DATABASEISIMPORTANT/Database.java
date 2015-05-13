package DATABASEISIMPORTANT;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;

import Backend.*;

public class Database 
{
	
	static final String userFolder = "users";
	static final String showFolder = "shows";
	
	static final String delimiter = "|||";
	
	public User getUser(String username, String password)
	{
		
		String userDirectory = (Database.userFolder + File.pathSeparator + username);
		
		if (new File(userDirectory).exists())
		{
			
			if (readFile(new File(userDirectory + File.pathSeparator + "pswd.txt")).get(0).equals(password))
			{
				
				
				try 
				{
					
					URL picLoc = new URL("http://www.skippable.tv/" + userDirectory + File.pathSeparator + "pic.jpg");
					
					
					
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
	
	public boolean createUser(User newUser)
	{
		
		return false;
		
	}
	
	public boolean updateUser(User updated, String password)
	{
		
		return false;
		
	}
	
	public boolean deleteUser(String username, String password)
	{
		
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

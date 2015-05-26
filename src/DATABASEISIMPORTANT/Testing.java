package DATABASEISIMPORTANT;

import java.net.MalformedURLException;
import java.net.URL;

import Backend.User;

public class Testing {
	
	public static void main(String[] args) throws MalformedURLException
	{
		Database.createUser(new User("qwertyuiop", new URL("http://")), "longlivetheconfederacy");
	}

}

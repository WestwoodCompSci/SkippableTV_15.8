public class Encrypter {

	private static String myKey;

	public Encrypter(String key)
	{
		myKey = key;
	}

	public String encrypt(String plainText)
	{

		String encoded = "";

		for (int i = 0; i < plainText.length(); i++)
		{
			encoded += (char) (plainText.charAt(i) + myKey.charAt(i % myKey.length()));
		}

		return encoded;
	} 


	public String decrypt(String encoded)
	{
		String decoded = "";		
		
		for (int i = 0; i < encoded.length(); i++)
		{
			decoded += (char) (encoded.charAt(i) - myKey.charAt(i % myKey.length()));
		}
		
		return decoded;
	}
}


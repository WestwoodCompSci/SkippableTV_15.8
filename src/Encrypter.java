import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class Encrypter {

	private Cipher myCipher;
	private SecretKey myKey;

	public Encrypter() 
	{
		try {
			KeyGenerator kgen = KeyGenerator.getInstance("AES");
			kgen.init(128);
			myKey = kgen.generateKey();

			myCipher = Cipher.getInstance("AES");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	public String encrypt(String plainText)
	{		
		//Initialize Cipher to encrypt mode
		try {
			myCipher.init(Cipher.ENCRYPT_MODE, myKey);
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Convert String to byte[]
		byte[] input = plainText.getBytes();
		//Initializes a byte array that will store the encrypted bytes
		byte[] encrypted = new byte[myCipher.getOutputSize(input.length)];
		
		//Encrypts
		try {
			encrypted =  myCipher.doFinal(input);
		} catch (IllegalBlockSizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BadPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Encrypted byte array --> to Base64 String
		return Base64.getEncoder().encodeToString(encrypted);
	} 

	public String decrypt(String encoded)
	{
		//Initializes Cipher to decrypt mode
		try {
			myCipher.init(Cipher.DECRYPT_MODE, myKey);
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Takes encoded Base64 String --> byte array
		byte[] byteArr = Base64.getDecoder().decode(encoded);
		//Initializes byte array that will store decrypted array
		byte[] decrypted = new byte[myCipher.getOutputSize(byteArr.length)];
		
		//Decrypts
		try {
			decrypted =  myCipher.doFinal(byteArr);
		} catch (IllegalBlockSizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BadPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Returns decrypted byte array --> String
		return this.bytesToString(decrypted);
	}
	
	//Converts decrypted byte array to a String
	private String bytesToString(byte[] b)
	{
		String f = "";
		
		for (byte c : b)
		{
			f += (char) c;
		}
		
		return f;
	}
	
	public static void main(String[] args)
	{
		Encrypter e = new Encrypter();
		String enc =  e.encrypt("Hello world");
		System.out.println(enc);
		System.out.println(e.decrypt(enc));
	}
}


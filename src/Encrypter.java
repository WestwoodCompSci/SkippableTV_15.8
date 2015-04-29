import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

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

	public byte[] encrypt(String plainText)
	{		
		try {
			myCipher.init(Cipher.ENCRYPT_MODE, myKey);
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[] input = plainText.getBytes();

		byte[] encrypted = new byte[myCipher.getOutputSize(input.length)];
		
		try {
			encrypted =  myCipher.doFinal(input);
		} catch (IllegalBlockSizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BadPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return encrypted;
	} 

	public String decrypt(byte[] encoded)
	{
		try {
			myCipher.init(Cipher.DECRYPT_MODE, myKey);
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		byte[] decrypted = new byte[myCipher.getOutputSize(encoded.length)];
		try {
			decrypted =  myCipher.doFinal(encoded);
		} catch (IllegalBlockSizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BadPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return this.bytesToString(decrypted);
	}

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
		byte[] enc =  e.encrypt("Hello world");
		System.out.println(e.decrypt(enc));
	}
}


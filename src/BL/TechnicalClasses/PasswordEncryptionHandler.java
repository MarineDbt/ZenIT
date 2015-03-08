package BL.TechnicalClasses;
import java.security.*;
import java.util.Formatter;

public class PasswordEncryptionHandler {
	public String encryptPassword(String psw){
		byte[] encryptedPassword =null;
		
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("SHA1");
			md.update(psw.getBytes());
			encryptedPassword=md.digest();
		
		} catch (Exception e) {
			// TODO : Exception handling
			e.printStackTrace();
		}
		return byteToHex(encryptedPassword);
		
	}

	private String byteToHex(final byte[] hash)
	{
	    Formatter formatter = new Formatter();
	    for (byte b : hash)
	    {
	        formatter.format("%02x", b);
	    }
	    String result = formatter.toString();
	    formatter.close();
	    return result;
	}
}
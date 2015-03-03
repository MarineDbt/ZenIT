package BL.TechnicalClasses;
import java.security.*;

public class PasswordEncryptionHandler {
	public String encryptPassword(String psw){
		byte[] encryptedPassword =null;
		
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("SHA1");
			md.update(psw.getBytes());
			encryptedPassword=md.digest();
		
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return encryptedPassword.toString();
		
	}
}

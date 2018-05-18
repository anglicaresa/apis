package blowfish.mule.packag;

import java.io.*;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;




public class encrypt {

	private final static Logger logger = LogManager.getLogger(FileReader.class);
	
	public String encrypt_blowfish(String strClearText,String strKey) {
		String strData="";
		
		try {
			SecretKeySpec skeyspec=new SecretKeySpec(strKey.getBytes(),"Blowfish");
			Cipher cipher=Cipher.getInstance("Blowfish");
			cipher.init(Cipher.ENCRYPT_MODE, skeyspec);
			byte[] encrypted=cipher.doFinal(strClearText.getBytes());
			strData=new String(encrypted);
			
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
		return strData;
	}
	
	
	
	
}

package blowfish.mule.packag;

import java.io.*;

public class writetofile {
	public static void writestringtofile(String yourtext)
	{
		
		try {
           
            File newTextFile = new File("C:/Jerry Shen/encrypt.txt");

            FileWriter fw = new FileWriter(newTextFile);
            fw.write(yourtext);
            fw.close();

        } catch (IOException iox) {
            //do stuff with exception
            iox.printStackTrace();
        }
		
	}
}

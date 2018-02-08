import java.net.*;
import java.io.*;

public class URLConnector{
	public static void main(String[] s) throws Exception{
		URL url = new URL("https://en.wikipedia.org/wiki/Amoeba_(operating_system)");
		//"https://ohmy.disney.com/movies/2014/07/09/everythings-coming-up-sparrow/?cmp=SMC%7Cblgomd%7COMDJuly%7CFB%7CSparrow-JackSparrow%7CInHouse%7C070914%7C%7C%7Cesocialmedia%7C%7C%7C"
		// Establish connection
		URLConnection con = url.openConnection();

		// retrive header information
		System.out.println("Date:" + con.getDate());
		System.out.println("Content type:" + con.getContentType());
		System.out.println("Expiration:" + con.getExpiration());
		System.out.println("Content length:" + con.getContentLength() + " bytes");
		System.out.println("Content encoding:" + con.getContentEncoding());

		System.out.println("Query string:" + url.getQuery());

		InputStream is = con.getInputStream();
		int c, i=con.getContentLength();
		while((c=is.read())!=-1 && (i--)>0){
			System.out.print((char)c);
		}
	}
}
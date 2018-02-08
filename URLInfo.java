import java.net.*;

public class URLInfo{
	public static void main(String[] s) throws Exception{
		String urlString = "https://en.wikipedia.org/wiki/Bitcoin#Legal_status_and_regulation";
		URL url = new URL(urlString);
		System.out.println("Protocol: "+url.getProtocol());
		System.out.println("Host: "+url.getHost());
		System.out.println("File: "+url.getFile());
		System.out.println("Port: "+url.getPort());
		System.out.println("External form: "+url.toExternalForm());
	}
}
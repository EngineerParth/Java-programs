import java.net.*;

public class InetAddressTest {
	public static void main(String[] s) throws UnknownHostException{
		String hostName = s[0];

		InetAddress[] address1 = InetAddress.getAllByName(hostName);
		for(InetAddress a:address1){
			System.out.println(a);
			System.out.println("Is multicast address: "+a.isMulticastAddress());
		}

	}
}
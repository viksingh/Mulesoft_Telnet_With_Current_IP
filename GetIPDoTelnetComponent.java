package org.mule.transformers;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class GetIPDoTelnetComponent implements Callable{
@Override
    public Object onCall(MuleEventContext eventContext) throws Exception {
    String output = "";
	Socket MyClient;
    try {

    	
    	SocketAddress sockaddr = new InetSocketAddress("Server",<port>);
    	
    	Socket socket = new Socket();
    	
    	// Connect with 10 s timeout
    	socket.connect(sockaddr, 10000);
    	
    	socket.close();
    
           output = "Connction successful to SAP PO (<Server>,<Port> )from " + InetAddress.getLocalHost().toString() ;
    }
    catch (IOException e) {
    	output = "Connction failed to SAP PO (<Server>,<Port> )from " + InetAddress.getLocalHost().toString() ;
    }
	
	
/*	InetAddress myIpaddress = InetAddress.getLocalHost();    
	output = output + myIpaddress.toString();
    */
    
	eventContext.getMessage().setPayload(output);
        return eventContext.getMessage().getPayload();
    }
}

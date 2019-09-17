//C:\DEV\eclipse-jee-photon-R-win32-x86_64\apps-workspaces\Day-20190808_first\bin>java -cp ./ net1.TCPEchoServer 9000
//수신한 메시지: HelloJava

package net3;

import java.io.IOException;
import java.net.ServerSocket;

public class TCPEchoServer {
	
	
	

	public static void main(String[] args) {
		//유효성 처리(Validation)
		if(args.length != 1) {
			System.out.println("파라미터 : <포트번호>");
			System.exit(0);
		}
	
		int port=Integer.parseInt(args[0]);
		
		ServerSocket server=null;
		try {
			server=new ServerSocket(port);
			
			PoolDispatcher tPool = new PoolDispatcher();
			tPool.startDispatching(server);
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}	
}
				
	
	 
	

//C:\DEV\eclipse-jee-photon-R-win32-x86_64\apps-workspaces\Day-20190808_first\bin>java -cp ./ net1.TCPEchoServer 9000
//수신한 메시지: HelloJava

package net2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

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
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
				
	
		while(true) {
			try {
			Socket con = server.accept();
			
			TCPEchoServerThread process = new TCPEchoServerThread(con);
			
			Thread thread = new Thread(process);
			thread.start();
			
			} catch (IOException e) {
				e.printStackTrace();
			}

			}
		} 
	}

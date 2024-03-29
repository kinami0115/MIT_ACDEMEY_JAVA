package net3;



import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import net1.TCPEchoServer;

public class PoolDispatcher   {
	
		
	
		static final String NUMTHREADS = "10";
		static final String THREADDROP= "Thread";
		
		private int numThreads = 0;
		
		public PoolDispatcher() {
			numThreads=Integer.parseInt(System.getProperty(THREADDROP, NUMTHREADS));
				
		}
		
	
		public void startDispatching(final ServerSocket server) {
			
			for(int i=0; i < (numThreads-1); i++) {
				Thread thread = new Thread() {
					public void run() {
						dispatchLoop(server);
					}
				};
				thread.start();
			}
			dispatchLoop(server);				
				
			}


		private void dispatchLoop(final ServerSocket server) {
			try {
				BufferedInputStream bis=null;
				BufferedOutputStream bos=null;
				Socket con = server.accept();
				
				bis=new BufferedInputStream(con.getInputStream());
				bos=new BufferedOutputStream(con.getOutputStream());
				
				byte buf[]=new byte[256];
				int len=0;
				String str="";
				
				
				while((len=bis.read(buf,0,buf.length)) != -1) {
					//3-2.읽기
					str=str+new String(buf,0,len);
					//3-3.디스플레이
					bos.write(buf,0,len);
					bos.flush();
					
					if(str.indexOf("\n") != -1);
						break;
				}
				
				System.out.println("수신한 메시지: "+str);
				
				//4.종료
				bos.close();
				bis.close();
				con.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		
		
		
		
				

		public static void main(String[] args) {
			//유효성 처리(Validation)
			if(args.length != 1) {
				System.out.println("파라미터 : <포트번호>");
				System.exit(0);
			}
			
			int port=Integer.parseInt(args[0]);
			
			TCPEchoServer server=new TCPEchoServer(port);
			
			server.process();

		}

	}



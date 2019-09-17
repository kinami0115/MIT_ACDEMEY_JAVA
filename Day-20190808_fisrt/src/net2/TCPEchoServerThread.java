package net2;



import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.Socket;

import net1.TCPEchoServer;

public class TCPEchoServerThread  implements Runnable {
	
		
		private Socket con = null;
		private BufferedInputStream bis=null;
		private BufferedOutputStream bos=null;
		
		public TCPEchoServerThread(Socket con) {
			//1.���ϰ�ü ����
		con=con;
				
		}
		
	
		@Override
		public void run() {
				try {
				
					bis=new BufferedInputStream(con.getInputStream());
					bos=new BufferedOutputStream(con.getOutputStream());
					
					byte buf[]=new byte[256];
					int len=0;
					String str="";
					
					
					while((len=bis.read(buf,0,buf.length)) != -1) {
						//3-2.�б�
						str=str+new String(buf,0,len);
						//3-3.���÷���
						bos.write(buf,0,len);
						bos.flush();
						
						if(str.indexOf("\n") != -1);
							break;
					}
					
					System.out.println("������ �޽���: "+str);
					
					//4.����
					bos.close();
					bis.close();
					con.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
				
			}
			
		
		
		
		
				

		public static void main(String[] args) {
			//��ȿ�� ó��(Validation)
			if(args.length != 1) {
				System.out.println("�Ķ���� : <��Ʈ��ȣ>");
				System.exit(0);
			}
			
			int port=Integer.parseInt(args[0]);
			
			TCPEchoServer server=new TCPEchoServer(port);
			
			server.process();

		}

	}



package com.code.test;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServlet 
{

	public static void main(String[] args) 
	{
		try {
			ServerSocket ss = new ServerSocket(2333);
			Socket s = ss.accept();
			InputStream is = s. getInputStream();
			DataInputStream dis = new DataInputStream(is);
			OutputStream os = s.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			String info;
			while (true) {
				
			
				info = dis.readUTF();
				System.out.println("客服端说："+info);
				if (info.equals("bye")) {
					break;
				}
				System.out.println("服务器请说话："+info);
				info = br.readLine();
				dos.writeUTF(info);
				if (info.equals("bye")) {
					break;
				}
			}
			dis.close();
			dos.close();
			s.close();
			ss.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

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
import java.net.UnknownHostException;

public class Client 
{

	public static void main(String[] args) 
	{
		 
			try {
				Socket s = new Socket("172.16.148.140",2333);
				
				InputStream is = s. getInputStream();
				DataInputStream dis = new DataInputStream(is);
				OutputStream os = s.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);
				
				String info;
				while (true) {
					
					System.out.println("客服端请说话：");
					info = br.readLine();
					dos.writeUTF(info);
					if (info.equals("bye")) {
						break;
					}
					dis.readUTF();
					System.out.println("服务器说："+info);
					if (info.equals("bye")) {
						break;
					}
				}
				dis.close();
				dos.close();
				s.close();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}

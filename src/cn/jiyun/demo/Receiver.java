package cn.jiyun.demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Receiver {

	public static void main(String[] args) throws IOException {
		DatagramSocket socket = new DatagramSocket(5545);
		
		//��������
		byte[] arr=new byte[1024*64];
		DatagramPacket dp=new DatagramPacket(arr, arr.length);
		
		//�����浽�Ŀյİ���������
		socket.receive(dp);
		
		InetAddress address = dp.getAddress();
		byte[] brr = dp.getData();
		int length=dp.getLength();
		System.out.println(address);
		
		String str=new String(brr,0,length);
		
		System.out.println("���ն��յ�������Ϊ��"+str);
		
		socket.close();
		
		
	}
}

package cn.jiyun.demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Receiver {

	public static void main(String[] args) throws IOException {
		DatagramSocket socket = new DatagramSocket(5545);
		
		//接收数据
		byte[] arr=new byte[1024*64];
		DatagramPacket dp=new DatagramPacket(arr, arr.length);
		
		//将保存到的空的包裹对象中
		socket.receive(dp);
		
		InetAddress address = dp.getAddress();
		byte[] brr = dp.getData();
		int length=dp.getLength();
		System.out.println(address);
		
		String str=new String(brr,0,length);
		
		System.out.println("接收端收到的数据为："+str);
		
		socket.close();
		
		
	}
}

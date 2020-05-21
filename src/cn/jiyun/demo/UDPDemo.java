package cn.jiyun.demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * 
 * @author 张宁
 *	UDP主要依赖DatagramSocket与DatagramPacket
 *	DatagramSocket用来发送和接收数据报包的套接字
 *	DatagramPacket用来实现无连接包投递,数据报包用来实现无连接包投递服务
 */
public class UDPDemo {
	
	public static void main(String[] args) throws SocketException, IOException {
		
		//UDP传输发送端思路
		//1:建立udp的socket服务
		//2：将要发送的数据封装成数据包
		//3:通过udp的socket服务，将数据包发送出
		//4:关闭资源
		
		DatagramSocket socket = new DatagramSocket();
		//创建数据报包对象
		DatagramPacket dp=new DatagramPacket("你好我是张宁".getBytes(),"你好我是张宁".getBytes().length,InetAddress.getByName("169.254.119.168"),5545);
		
		socket.send(dp);
		
		socket.close();
	}
	
}

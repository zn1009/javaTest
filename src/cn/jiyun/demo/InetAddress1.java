package cn.jiyun.demo;

import java.io.IOException;
import java.net.InetAddress;

public class InetAddress1 {

	public static void main(String[] args) throws IOException {
		InetAddress ip = InetAddress.getByName("DESKTOP-GRBGU2T");
		System.out.println(ip);
		String name = ip.getHostName();
		System.out.println("主机名为："+name);
		
		String address = ip.getHostAddress();
		System.out.println("主机Ip为："+address);
		
		
		
	}
}

package cn.jiyun.demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * 
 * @author ����
 *	UDP��Ҫ����DatagramSocket��DatagramPacket
 *	DatagramSocket�������ͺͽ������ݱ������׽���
 *	DatagramPacket����ʵ�������Ӱ�Ͷ��,���ݱ�������ʵ�������Ӱ�Ͷ�ݷ���
 */
public class UDPDemo {
	
	public static void main(String[] args) throws SocketException, IOException {
		
		//UDP���䷢�Ͷ�˼·
		//1:����udp��socket����
		//2����Ҫ���͵����ݷ�װ�����ݰ�
		//3:ͨ��udp��socket���񣬽����ݰ����ͳ�
		//4:�ر���Դ
		
		DatagramSocket socket = new DatagramSocket();
		//�������ݱ�������
		DatagramPacket dp=new DatagramPacket("�����������".getBytes(),"�����������".getBytes().length,InetAddress.getByName("169.254.119.168"),5545);
		
		socket.send(dp);
		
		socket.close();
	}
	
}

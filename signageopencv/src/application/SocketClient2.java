package application;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient2 extends Thread{
	@Override
	public void run() {

		String serverIp = "1.255.57.236";
		Socket socket = null;
		
		//���� ����
		try {
			socket = new Socket(serverIp,7777);
			System.out.println("/////////������ ����Ǿ����ϴ�///////////");
			
			FileSender fs = new FileSender(socket);
			fs.start();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
package Socket;

import javax.swing.*;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 杨光儒
 * @Title: ServerListen
 * @ProjectName project1
 * @Description: TODO
 * @date 2018/8/1122:59
 */
public class ServerListen extends Thread  {
    @Override
    public void run()  {
        //监听19706端口,接受客户端请求
        try {
            ServerSocket socket = new ServerSocket(19706);
            while (true){
                Socket socket1 =socket.accept();
                JOptionPane.showConfirmDialog(null,"访问端口了");
                ChatSocket cs = new ChatSocket(socket1);
                cs.start();
                ChatManager.getCm().add(cs);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //端口被连接

    }
}

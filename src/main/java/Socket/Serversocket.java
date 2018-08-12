package Socket;

import javax.swing.*;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 杨光儒
 * @Title: ServerSocket
 * @ProjectName project1
 * @Description: TODO
 * @date 2018/8/1121:18
 */
public class Serversocket {
    public static void main(String[] args){
    ServerListen sl = new ServerListen();
    sl.start();
    }
}

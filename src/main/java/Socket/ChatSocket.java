package Socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @author 杨光儒
 * @Title: ChatSocket
 * @ProjectName project1
 * @Description: TODO
 * @date 2018/8/1123:33
 */
public class ChatSocket extends Thread {
    Socket socket;
    public ChatSocket(Socket st){
        this.socket =st;
    }
    public void out(String out) throws IOException {
        socket.getOutputStream().write(out.indexOf("UTF-8"));
    }
    @Override
    public void run()  {
        try {

            InputStreamReader ir = new InputStreamReader(socket.getInputStream());
            BufferedReader br = new BufferedReader(ir);
            String str =null;
            while ((str=br.readLine())!=null){
                ChatManager.getCm().pubilsh(this,str);
            }
            br.close();
            ir.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

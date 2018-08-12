package Socket;

import java.io.IOException;
import java.util.Vector;

/**
 * @author 杨光儒
 * @Title: ChatManager
 * @ProjectName project1
 * @Description: TODO
 * @date 2018/8/1123:33
 */
public class ChatManager {
    private static final ChatManager cm = new ChatManager();
    private ChatManager(){}

    public static ChatManager getCm() {
        return cm;
    }

    Vector<ChatSocket> vecter = new Vector<ChatSocket>();
    /*
    * 把socket线程添加进来
    * */
    public void add(ChatSocket cs){
        vecter.add(cs);
    }
    /*
    * 其中某一个线程调用该方法向所有客户端发送信息
    * 要把当前的线程传进来，与要发送的信息传进来
    * 要发送给集合中的线程，要进行遍历
    * 如果是当前发送信息的线程就不用接收信息了
    * */
    public void pubilsh(ChatSocket cs,String out) throws IOException {
        for (int i = 0; i <vecter.size(); i++) {
            ChatSocket chatSocket = vecter.get(i);
            if (!cs.equals(chatSocket)) {
                chatSocket.out(out);
            }
        }
    }
}

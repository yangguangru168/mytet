package webservice;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author 杨光儒
 * @Title: Client
 * @ProjectName project1
 * @Description: TODO
 * @date 2018/8/816:00
 */
public class Client {
    public static void main(String[] args) throws MalformedURLException {
       IServiceImpl iService = new IServiceImpl();
       iService.hello("hello word");
    }
}

package webservice;

import javax.xml.ws.Endpoint;

/**
 * @author 杨光儒
 * @Title: ServiceMain
 * @ProjectName project1
 * @Description: TODO
 * @date 2018/8/815:36
 */
public class ServiceMain {
    public static void main(String[] args) {
        String address = "http://192.168.150.1:6/ygr";
        Endpoint.publish(address, new IServiceImpl());
        System.out.println("发布成功");
    }
}

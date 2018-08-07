package design;
/**
 *
 *@ClassName HungrySingleton 饿汉单例模式
 *@Description TODO
 *@Author 杨光儒
 *@Date 2018/8/7 14:37
 *@Version 1.0
 **/
public class HungrySingleton {

    /*
    * 定义一个对象
    * */
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    public static synchronized HungrySingleton getHungrySingleton(){
        return hungrySingleton;
    }
}

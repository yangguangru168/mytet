package design;
/**
 *
 *@ClassName LazySingleton 懒汉单例模式：获取实例时才会检查并创建实例
 *@Description TODO
 *@Author 杨光儒
 *@Date 2018/8/7 14:24
 *@Version 1.0
 **/
public class LazySingleton {
    //声明一个全局变量
    private static LazySingleton lazySingleton;

    /*定义私有的构造函数避免其他调用通过New LazySingleton
    *
    * 将无参构造声明为私有方法，禁止通过无参构造创建实例
    * */
    private LazySingleton(){}

    public static synchronized LazySingleton getLazySingleton(){
        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}

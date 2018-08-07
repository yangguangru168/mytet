package ClassAdapter;
/**
 * 类适配器 就是接口A想用的方法再接口B哪里，但尴尬的是它们两个毫无交集，所以需要一个中间人介绍，即AandBadapte
 * 它首先继承B接口的实现类这样AandBadapte就拥有B接口的方法（相当于把B收购了，B的东西已经归它了）、在实现A接口，然后
 * 对A接口的a方法进行重写，再方法里面调用B接口的方法，这样A也就拥有b方法了
 *@ClassName ClassAdapter
 *@Description TODO
 *@Author 杨光儒
 *@Date 2018/8/7 16:01
 *@Version 1.0
 **/
public class ClassAdapter {
    public static void main(String[] args) {
        A ab = new  AandBadapter();
        ab.a();
    }
}

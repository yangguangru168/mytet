package factory;

import ClassAdapter.A;

/**
 * @author 杨光儒
 * @Title: Main
 * @ProjectName project1
 * @Description: TODO
 * @date 2018/8/1221:45
 */
public class Main {
    public static void main(String[] args) {
        /*CreatAnimalFactory cf = new DogFactory();//实例化狗狗工厂
        Animal am = cf.createAnimal();//调用方实例化Dog对象
        am.eat();*/
        Animal am = AnimalFactory.creatAnimal("cat");
        am.eat();
    }
}

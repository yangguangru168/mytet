package factory;

/**
 * @author 杨光儒
 * @Title: AnimalFactory
 * @ProjectName project1
 * @Description: TODO
 * @date 2018/8/1221:51
 */
public class AnimalFactory {
    public static Animal creatDogAnimal(){
        return new Dog();
    }
    public static Animal creatCatAnimal(){
        return new Cat();
    }
    public static Animal creatAnimal(String str){
        if(str.equals("dog")){
            return new Dog();
        }
        else if (str.equals("cat")) {
            return  new Cat();
        }
        else {
            return null;
        }
    }
}

package factory;

/**
 * @author 杨光儒
 * @Title: Dog
 * @ProjectName project1
 * @Description: TODO
 * @date 2018/8/1221:33
 */
public class DogFactory implements CreatAnimalFactory {

    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}

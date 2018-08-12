package factory;

/**
 * @author 杨光儒
 * @Title: CatFactory
 * @ProjectName project1
 * @Description: TODO
 * @date 2018/8/1221:40
 */
public class CatFactory implements CreatAnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}

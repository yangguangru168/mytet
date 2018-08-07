package objectadapter;

/**
 * @author 杨光儒
 * @Title: AandBadapter
 * @ProjectName project1
 * @Description: TODO
 * @date 2018/8/716:36
 */
public class AandBadapter extends Bimpl implements A {
    private B b;
    public AandBadapter(B b){
        this.b = b;
    }
    public void a() {
        b.b();
    }
}

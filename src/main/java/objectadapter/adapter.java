package objectadapter;

/**
 * @author 杨光儒
 * @Title: adapter
 * @ProjectName project1
 * @Description: TODO
 * @date 2018/8/716:25
 */
public class adapter {
    public static void main(String[] args) {
        Bimpl bm = new Bimpl();
        A a = new AandBadapter(bm);
        a.a();
    }
}

package webservice;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.Date;

/**
 * @author 杨光儒
 * @Title: IServiceImpl
 * @ProjectName project1
 * @Description: TODO
 * @date 2018/8/815:30
 */
@WebService(endpointInterface = "webservice.IService")
public class IServiceImpl implements IService {
    @Override
    public void hello(String username) {
        System.out.println(username);
    }
}

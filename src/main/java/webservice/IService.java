package webservice;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author 杨光儒
 * @Title: IService
 * @ProjectName project1
 * @Description: TODO
 * @date 2018/8/815:23
 */

@WebService
public interface IService {
    public void hello( String username);
}
